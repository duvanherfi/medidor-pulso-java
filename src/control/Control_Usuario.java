/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;
import org.apache.commons.codec.digest.DigestUtils;
import vista.Interfaz;

public abstract class Control_Usuario {

    private static Connection cn = new Conectar().getConectar();

    // metodos
    public static int registrarUsuario(Usuario usuario) {
        int estado = -1;

        PreparedStatement pstm = null;
        String sql = null;
        String textoSinEncriptar = usuario.getContraseña();
        String passwordMD5 = DigestUtils.md5Hex(textoSinEncriptar);

        try {
            //realizamos la conexion sql
            //Usuario(nombres,apellidos,edad,peso,usuario,contraseña));
            //INSERT INTO usuario VALUES (NULL, 'Duvan', 'Hernandez Figueroa', '21', '82', 'duvanherfi', 'duvan123');
            sql = "insert into usuario values (NULL,?,?,?,?,?,?)";

            pstm = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, usuario.getNombres());
            pstm.setString(2, usuario.getApellidos());
            pstm.setInt(3, usuario.getEdad());
            pstm.setInt(4, usuario.getPeso());
            pstm.setString(5, usuario.getUsuario());
            pstm.setString(6, passwordMD5);
            estado = pstm.executeUpdate();

        } catch (MySQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
            return -2;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return -2;
        } finally {
            try {
                //cerramos la conexion
                if (pstm != null) {
                    pstm.close();
                }
                //if (cn!=null) cn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return estado;
    }

    public static boolean loginUsuario(String usuario, String Pass) {
        //creamos un objeto de tipo Usario: data para guardar al sesion 
        boolean estadoLogin = false;
        String textoSinEncriptar = Pass;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = null;
        String passwordMD5 = DigestUtils.md5Hex(textoSinEncriptar);

        try {
            //realizamos la conexion sql

            sql = "select * " + "from usuario "
                    + "where usuario='" + usuario + "' and password='" + passwordMD5 + "';";

            // ejecutamos el query sql
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            estadoLogin = rs.first();

            //Almacenamos al obj data para almacenar la informacion del sesion
            Interfaz.logueado = new Usuario(rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad"), rs.getInt("peso"), usuario, Pass);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                //cerramos la conexion
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                //if (cn!=null) cn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
        return estadoLogin;
    }


}

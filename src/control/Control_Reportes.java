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
import modelo.Registro_Pulso;

public abstract class Control_Reportes {

    public static int id = 0;

    // metodos
    public static int getPulso(int id) {
        Connection cn = new Conectar().getConectar();
        int pulso = 0;
        ResultSet r;
        PreparedStatement pstm = null;
        String sql = null;

        try {
            //realizamos la conexion sql
            sql = "select pulso from registro_pulso where id_persona=?;";

            pstm = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setInt(1, id);

            r = pstm.executeQuery();
            r.first();
            pulso = r.getInt(1);

        } catch (MySQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
            return 0;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return 0;
        } finally {
            try {
                //cerramos la conexion
                if (pstm != null) {
                    pstm.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return pulso;
    }

    public static Registro_Pulso getReporte(int id) {
        Connection cn = new Conectar().getConectar();
        Registro_Pulso registro = null;
        ResultSet r;
        PreparedStatement pstm = null;
        String sql = null;

        try {
            //realizamos la conexion sql
            sql = "select * from registro_pulso,rango_pulso where id=? "
                    + "and registro_pulso.rango=rango_pulso.rango;";

            pstm = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setInt(1, id);
            r = pstm.executeQuery();
            r.first();
            registro = new Registro_Pulso(r.getString("rango"), id, r.getInt("pulso"));
            registro.setRecomendacion(r.getString("descripcion") + "\n" + r.getString("recomendacion"));

        } catch (MySQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            try {
                //cerramos la conexion
                if (pstm != null) {
                    pstm.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return registro;
    }

    public static int registrarReporte(Registro_Pulso r) {
        Connection cn = new Conectar().getConectar();
        int estado = -1;

        PreparedStatement pstm = null;
        String sql = null;

        try {
            //realizamos la conexion sql
            //UPDATE `registro_pulso` SET `rango` = '1', `pulso` = '44' WHERE `registro_pulso`.`id` = 1
            sql = "update registro_pulso set rango=?, pulso=? where id=?;";

            pstm = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, r.getRango());
            pstm.setInt(2, r.getPulso());
            pstm.setInt(3, r.getId_persona());

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
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return estado;
    }
}

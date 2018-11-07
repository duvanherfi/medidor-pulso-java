package conexion;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	//Creamos la clase getConectar que servira para la conexion con la base de datos
	
	public Connection getConectar(){
		String dataBase = "medidorPulso", user = "root", pass = "root";
		Connection xConectar = null;
		
		try {
			//Llamamos a nuestra class del driver para base de datos de Java Mysql
			Class.forName("com.mysql.jdbc.Driver");
			xConectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dataBase,user,pass);
                        System.out.println("conexion establecida");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return xConectar;
	}
}

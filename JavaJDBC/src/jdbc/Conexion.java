package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static  String cadenaConexion;
	private static String usuario;
	private static String pwd;
	
	//Este método permite establecer la cadena de conexión con la base 
	//de datos y así poder posteriormente crear una conexión.
	public static void setURL(String dburl) {
	    final String fabricante = "mysql", servidor = "localhost", puerto = "8889";
	    final String db = "libros";
	    final String opciones = "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
	    cadenaConexion = "jdbc:" + fabricante + "://" + servidor + ":" + puerto + "/" + db + "?" + opciones;
	    usuario = "root";
	    pwd = "root";
	}

	//Este método, la primera vez que accedemos a la BD crea el objeto Connection 
	//pero las siguientes veces, como ya está creado, nos lo devuelve, por lo que es 
	//una optimización doble: solo “tarda” la primera vez porque las siguientes se reutiliza
	//por otro lado, siempre consumimos un única conexión de la BD desde nuestro programa.

	public static Connection getConexion() {
	    Connection con = null;
	    try {
	        con = DriverManager.getConnection(cadenaConexion, usuario, pwd);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return con;
	}

	
	//Este método debemos llamarlo para finalizar la conexión con la base de datos y 
	//liberar así los recursos. Siempre debemos ser estrictos con esto para evitar posibles 
	//fugas de memoria (memory leaks)

	public static void desconecta(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

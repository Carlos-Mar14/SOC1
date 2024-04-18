package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaStatement {

	public static void main(String[] args) {

		// Creación de una sentencia SQL para obtener todos los libros de un determinado
		// autor.
		// Presentación de la información obtenida por pantalla y cierre de la conexión
		// con la BD.
		// Podemos crear un proyecto en Eclipse para probar estas clases de ejemplo. Si
		// no acabamos de entender
		// cómo funciona el código podríamos ejecutarlo en modo ‘debug’ para
		// familiarizarnos con su funcionamiento
		// (aunque esto no es crucial para realizar la práctica).
		// Cuando ya tengamos claro qué hacen las clases de ejemplo podemos pasar a
		// realizar los siguientes ejercicios

		// Usamos la cadena de conexión previamente establecia en la clase Conexion.java
		String url = "jdbc:mysql://localhost:8889/libros?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        try {
            // Establecer la URL de conexión utilizando el método estático de la clase Conexion
            Conexion.setURL(url);

            // Obtener la conexión utilizando el método estático de la clase Conexion
            Connection conexion = Conexion.getConexion();

            // Preparar la consulta SQL
            String librosAutor = "SELECT l.* " +
                    "FROM libro l " +
                    "JOIN autorlibro al ON l.CodigoLibro = al.CodLibro " +
                    "JOIN autores a ON al.CodAutor = a.CodigoAutor " +
                    "WHERE a.Nombre = ?";
            PreparedStatement comando = conexion.prepareStatement(librosAutor);

            // Establecer el parámetro de la consulta
            comando.setString(1, "GARY CORNELL");

            // Ejecutar la consulta
            ResultSet res = comando.executeQuery();
            while (res.next()) {
                // Acceder a los valores de las columnas de cada fila, por ejemplo:
                int codigoLibro = res.getInt("CodigoLibro");
                String isbn = res.getString("ISBN");
                // ... y así sucesivamente para cada columna que necesites
            }

            // Cerrar la conexión y liberar recursos
            conexion.close();
        } catch (SQLException e) {
            // Manejar cualquier excepción que pueda ocurrir durante la conexión o la ejecución de la consulta
            e.printStackTrace();
        }
    }
}
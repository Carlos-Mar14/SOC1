package uno;
import java.util.Arrays;
import java.util.Set;


/*
 * Para este codigo funcione tenemos que pasar en linea
 * de comando algo como lo siguiente: java.util.TreeSet Zamora Barcelona Alicante
 * 
 * 
 */
public class TestInstanciacionReflexiva {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Definimos una variable de tipo Class
		Class<?> unaClase=null;

		try { // Obtenemos un objeto Class a partir de un nombre de clase
			unaClase=Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			System.err.println("Clase no encontrada.");
			System.exit(1);
		}

		Set<String> unConjunto=null; // Definimos una variable de tipo Set<String>
		try { // La inicializamos a partir de una instancia obtenida
		      // del objeto Class definido previamente
			unConjunto=(Set<String>) unaClase.newInstance();
		} catch (IllegalAccessException e) {
			System.err.println("Clase no accesible.");
			System.exit(1);
		} catch (InstantiationException e) {
			System.err.println("Clase no instanciable.");
			System.exit(1);
		}
		// Añadimos al conjunto el resto de parametros
		// recibidos por linea de comandos
		unConjunto.addAll(Arrays.asList(args).subList(1,args.length));
		System.out.println(unConjunto);
	}
}

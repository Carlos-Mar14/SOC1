package aplicacion;

import java.util.Arrays;

import entidades.*;

public class App {

	public static void main(String[] args) {
		CentroComercial c1 = new CentroComercial("Barceloneta",
				new Local[] { new Bar("Bar centre", "7:00 - 22:00", 5, 230.0),
						new LocalRopaMixto("Ropa Todo", "7:00 - 1:00", 5, 140.4),
						new Libreria("Todo Libro", "9:00 - 15:00", 7, 433), new Comedor("KFC", "8 - 10", 20, 303.5),
						new Comedor("Express", "9-10", 40, 500),
						new TiendaDeportes("Declathon", "9-4", 30, 850)

				});
		System.out.println(
				"Centro Comercial: " + c1.getNombre() + "\n\nCantidad de locales: " + c1.getLocales().length + "\n");
		/*
		 * for (Local local: c1.getLocales()) { System.out.println(local.getNombre() +
		 * " - " + local.getClass().getSimpleName()); }
		 */

		System.out.println(Arrays.toString(c1.getLocales()));
	}

}

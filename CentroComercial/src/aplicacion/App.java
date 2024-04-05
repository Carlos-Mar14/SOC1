package aplicacion;

import entidades.*;

public class App {

	public static void main(String[] args) {

		CentroComercial cc = new CentroComercial("El Centro", 5);

		Local ropa = new Local();

		Local mujer = new Local();

		Local mixta = new TiendaMixta("Valls", "9-14", 4, 40.5);

		Local hombre = new Local();

		Local libro = new LocalLibro("Quijote", "14-23", 3, 4);

		Local comida[] = { new LocalComida("El Comensal", "14-23", 3, 4),
				new LocalComida("Colombia a la Carta", "14-23", 3, 3) };

		Local bar = new Comida_Bar("Licores La Perdición", "14-23", 3, 4);

		Local depor = new TiendaDeportes("Declathon", "14-23", 3, 4);

		System.out.println("Centro Comerciar: " + cc.getNameCentroComercial() + "\nCantidad de Locales: "
				+ cc.getCantLocales() + "\nLocales: ");

		double impuestoBar = mixta.calculoImpuesto();
		System.out.println("         " + bar.getName() + " - " + "Bar" + "  paga un impuesto de: " + impuestoBar);

		double impuestoMixta = mixta.calculoImpuesto();
		System.out.println("         " + mixta.getName() + " - " + "Tienda de Ropa Mixta" + "  paga un impuesto de: "
				+ impuestoMixta);

		double impuestLibro = libro.calculoImpuesto();
		System.out
				.println("         " + libro.getName() + " - " + "Libreria" + "  paga un impuesto de: " + impuestLibro);

		double impuestoDeporte = depor.calculoImpuesto();
		System.out.println("         " + depor.getName() + " - " + " Tienda de Deporte" + "  paga un impuesto de: "
				+ impuestoDeporte);

		/*
		 * double impuestoComida1 = comida.calculoImpuesto();
		 * System.out.println("         " + comida[0].getName() + " - " + "Comedor" +
		 * " Y paga un impuesto de: " + impuestoComida1); double impuestoComida2 =
		 * comida.calculoImpuesto(); System.out.println("         " +
		 * comida[1].getName() + " - " + "Comedor" + " Y paga un impuesto de: " +
		 * impuestoComida2);
		 */

	}

}

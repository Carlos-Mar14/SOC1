package bifurcaciones;

public class If {

	public static void main(String[] args) {

		String diaSemana = "domingo";

		if (diaSemana.equals("viernes")) {
			System.out.println("Cierto");
		} else {
			System.out.println("Hoy es  " + diaSemana);
		}
		System.out.println("Fin programa");
	}

}

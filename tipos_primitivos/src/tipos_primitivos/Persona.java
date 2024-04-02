package tipos_primitivos;

public class Persona {

	private final int precioTasa = 147;
	private final String nombre;

	Persona(String nom) {
		nombre = nom;
		System.out.println(nombre+ "\n" );
		System.out.println(nombre );
	}

	public static void main(String[] args) {
		new Persona(" Andres \n ");
	}
}

class Programador extends Persona {

	Programador(String nom) {
		super(nom);
	}
}
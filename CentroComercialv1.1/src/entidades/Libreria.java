package entidades;

public class Libreria extends Local{
	private static final double IPM_LIB =1.0;
	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libreria(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}
	public double calcularImpuesto() {
		return IPM_LIB * getM2();
		
	}
}

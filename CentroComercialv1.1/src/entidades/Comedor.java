package entidades;

public class Comedor extends Local{
	private static final double IPM_COMED =1.3;
	public Comedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comedor(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}
	public double calcularImpuesto() {
		return IPM_COMED * getM2();
		
	}
}

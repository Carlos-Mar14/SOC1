package entidades;

public class LocalRopaHombre extends Local{
	private static final double IPM_HOM =1.1;
	public LocalRopaHombre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalRopaHombre(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}
	public double calcularImpuesto() {
		return IPM_HOM * getM2();
		
	}
}

package entidades;

public class LocalRopaMixto extends Local{
	private static final double IPM_MIX =1.0;
	public LocalRopaMixto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalRopaMixto(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}
	public double calcularImpuesto() {
		return IPM_MIX * getM2();
		
	}
}

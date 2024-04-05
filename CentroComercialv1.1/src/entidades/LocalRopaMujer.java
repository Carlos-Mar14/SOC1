package entidades;

public class LocalRopaMujer extends Local{
	private static final double IPM_MUJ =0.9;
	public LocalRopaMujer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalRopaMujer(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}
	public double calcularImpuesto() {
		return IPM_MUJ * getM2();
		
	}
}

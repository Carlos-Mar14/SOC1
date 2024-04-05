package entidades;

public class TiendaDeportes extends Local{
	private static final double IPM_DEPOR =1.4;
	public TiendaDeportes() {
		super();
		
	}

	public TiendaDeportes(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
		// TODO Auto-generated constructor stub
	}

	public double calcularImpuesto() {
		return IPM_DEPOR * getM2();
		
	}
}

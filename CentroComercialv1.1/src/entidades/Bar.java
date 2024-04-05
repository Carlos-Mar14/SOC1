package entidades;

public class Bar extends Local{
private static final double IPM_BAR =1.2;
	public Bar() {
		super();
		
	}

	public Bar(String nombre, String horario, int empleados, double m2) {
		super(nombre, horario, empleados, m2);
	}
	public double calcularImpuesto() {
		return IPM_BAR * getM2();
		
	}
}

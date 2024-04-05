package entidades;

public abstract class Local {
	
	private String nombre;
	private String horario;
	private int empleados;
	private double m2;
	
	public Local() {}
	
	public Local(String nombre, String horario, int empleados, double m2) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.empleados = empleados;
		this.m2 = m2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	
	
	@Override
	public String toString() {
		return  " Nombre: " + nombre + ", Horario: " + horario + ", Empleados: " + empleados + ", M2: " + m2 +calcularImpuesto() + "€\n\n";
	}
	
	public abstract double calcularImpuesto();
	
}

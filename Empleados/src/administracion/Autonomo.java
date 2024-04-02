package administracion;

public class Autonomo extends Empleado{

	private double precioHora = 9.39;
	private int horaTrabajada;
	
	public Autonomo(String nombre, int edad, String departamento, double precioHora, int horaTrabajada) {
		super(nombre, edad, departamento);
		this.precioHora = precioHora;
		this.horaTrabajada = horaTrabajada;
	}

	public int getHoraTrabajada() {
		return horaTrabajada;
	}

	public void setHoraTrabajada(int horaTrabajada) {
		this.horaTrabajada = horaTrabajada;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public double calcuSueldo() {
		double sueldoAutonomo = precioHora * horaTrabajada;
		
		return sueldoAutonomo;
	}
	
}

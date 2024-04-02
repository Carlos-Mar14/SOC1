package tema3;

public class Becario extends Alumno {
	
	private double salario;
	
	public Becario(String nombre, int dni, double salario) {
		super(nombre, dni);
		this.salario=salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "\n Salario: " + salario;
	}
}

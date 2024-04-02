package entidades;


public class Comida_Bar extends LocalComida{

	public Comida_Bar(String name, String schedule, int employee, double squareMeter) {
		super(name, schedule, employee, squareMeter);
		
	}

	private double impuesto = 1.2;
	
	

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Comida_Bar [impuesto=" + impuesto + "]";
	}

	public double calculoImpuesto () {
		
		double calcuImpues = getImpuesto() * getSquareMeter();
		return calcuImpues;
	}
}

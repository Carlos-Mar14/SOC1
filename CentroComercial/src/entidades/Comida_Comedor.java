package entidades;


public class Comida_Comedor extends LocalComida{

	private double impuesto = 1.3;
	
	@Override
	public String toString() {
		return "Comida_Comedor [impuesto=" + impuesto + "]";
	}

	public Comida_Comedor(String name, String schedule, int employee, double squareMeter) {
		super(name, schedule, employee, squareMeter);
		
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double calculoImpuesto () {
		
		double calcuImpues = getImpuesto() * getSquareMeter();
		return calcuImpues;
	}
}

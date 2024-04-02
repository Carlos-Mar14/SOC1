package entidades;


public class TiendaMixta extends LocalRopa{

	private double impuesto = 1.0;
		
	@Override
	public String toString() {
		return "TiendaMixta [impuesto=" + impuesto + "]";
	}

	public TiendaMixta(String name, String schedule, int employee, double squareMeter) {
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

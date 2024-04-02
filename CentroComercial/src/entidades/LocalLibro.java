package entidades;


public class LocalLibro extends Local{
	
	private double impuesto = 1.0;
	
	public LocalLibro(String name, String schedule, int employee, double squareMeter) {
		super(name, schedule, employee, squareMeter);
		
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "LocalLibro [impuesto=" + impuesto + "]";
	}

	public double calculoImpuesto () {
		
		double calcuImpues = getImpuesto() * getSquareMeter();
		return calcuImpues;
	}
}

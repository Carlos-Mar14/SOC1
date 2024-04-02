package entidades;


public class TiendaHombre extends LocalRopa{

	private double impuesto = 1.1;
	
	@Override
	public String toString() {
		return "TiendaHombre [impuesto=" + impuesto + "]";
	}

	public TiendaHombre(String name, String schedule, int employee, double squareMeter) {
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

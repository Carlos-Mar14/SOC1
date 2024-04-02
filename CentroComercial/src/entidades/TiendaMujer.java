package entidades;


public class TiendaMujer extends LocalRopa{

	private double impuesto = 0.9;

	@Override
	public String toString() {
		return "TiendaMujer [impuesto=" + impuesto + "]";
	}


	public TiendaMujer(String name, String schedule, int employee, double squareMeter) {
		super(name, schedule, employee, squareMeter);
		
	}


	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}


}

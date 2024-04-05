package entidades;

public class TiendaDeportes extends Local{
	
	private double impuesto = 1.4;
	
	
	public TiendaDeportes(String name, String schedule, int employee, double squareMeter,
			double impuesto) {
		super(name, schedule, employee, squareMeter);
		this.impuesto= impuesto;
	}
	

	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	} 
	public double calcucoimpuesto(double squareMeter, double impuesto) {
		return impuesto * squareMeter;
	}

	@Override
	public String toString() {
		return "TiendaDeportes [impuesto=" + impuesto + "]";
	}
}

package entidades;

public class CentroComercial {

	private String NameCentroComercial;
	private int cantLocales;
	
	public CentroComercial(String nameCentroComercial, int cantLocales) {
		super();
		NameCentroComercial = nameCentroComercial;
		this.cantLocales = cantLocales;
	}
	
	public String getNameCentroComercial() {
		return NameCentroComercial;
	}
	public void setNameCentroComercial(String nameCentroComercial) {
		NameCentroComercial = nameCentroComercial;
	}
	public int getCantLocales() {
		return cantLocales;
	}
	public void setCantLocales(int cantLocales) {
		this.cantLocales = cantLocales;
	}
	@Override
	public String toString() {
		return "CentroComercial NameCentroComercial= " + NameCentroComercial + ", cantLocales= " + cantLocales + "]";
	}
	
	
}

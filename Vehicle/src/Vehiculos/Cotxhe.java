package Vehiculos;

public class Cotxhe extends Vehiculo{

	private int numPlazas;
	private String extras;
	
	Cotxhe(String fabricant, String mod, int anyCompra, int cod_provincia, int num, String letra_adicional,
			 float consum,int numPlazas, String extras)
	{	
		super(fabricant, mod, anyCompra, cod_provincia, num, letra_adicional, consum);
		
		this.numPlazas= numPlazas;
		this.extras= extras;
	}
	

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Cotxhe [numPlazas=" + numPlazas + ", extras=" + extras + "]";
	}
	
}

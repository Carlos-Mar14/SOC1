package ejercicio2;

public class CuentaCorriente extends CuentaBancaria{

	//atributos
	private boolean chequesEmitidos;
	
	//constructor
	public CuentaCorriente(String numCuenta, boolean cheques) {
		super(numCuenta);
		chequesEmitidos = cheques;
		
		
	}
	//constructor
	public CuentaCorriente(String numCuenta, double ini,  boolean cheques) {
		super(numCuenta, ini);
		chequesEmitidos = cheques;
	}

	
	public final void setChequesEmitidos(boolean chequesEmitidos) {
		this.chequesEmitidos = chequesEmitidos;
	}
	
	public final boolean isChequesEmitidos() {
		return chequesEmitidos;
	}
	//Herencia
	public String toString() {
		String msg = super.toString();
		if(isChequesEmitidos()){
			msg += "Tiene cheques emitidos";
		}
		else {
			msg += "NO tiene cheques emitidos";
		}			
		return msg;
	}			
}

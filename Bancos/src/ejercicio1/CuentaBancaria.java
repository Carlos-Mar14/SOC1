package ejercicio1;
import static utiles.Utiles.*;

public class CuentaBancaria {
	
	private String numCuenta;
	private double saldo;
	private static double cantInicial = MIN_CANT_APERT;

	//Constructor
	public CuentaBancaria(String numCuenta) {
		this(numCuenta, cantInicial);
		
	}
	//Constructor
	public CuentaBancaria(String numCuenta, double ini){
		this.numCuenta=numCuenta;
		if(ini < cantInicial) {
			String mensajeError = "La cantidad es menor que la cantidad minima de " + cantInicial+ " Euros";
			throw new RuntimeException(mensajeError);
		} else
			
		setSaldo(ini);
	}
	
	
	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			setSaldo(getSaldo()+ cantidad);
		//saldo += cantidad;
		
		} else {
			String mensajeError = "La cantidad válida " + cantidad + " no € es validad";
			throw new RuntimeException(mensajeError);
		}
	}

	public void retirar(double cantidad) {
		if(getSaldo() >= cantidad){
			setSaldo(getSaldo() - cantidad);
		} else {
			double diferenciaSaldo = cantidad - saldo;
			String mensajeError = " ¡Saldo insuficiente! Te faltan: " + diferenciaSaldo + "€";
			throw new RuntimeException(mensajeError);
		}

	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected double getCantInicial() {
		return cantInicial;
	}

	private void setCantInicial(double cantInicial) {
		CuentaBancaria.cantInicial = cantInicial;
	}
	
	
	
	public String toString() {
		return "Tipo de cuenta: " + this.getClass().getSimpleName() + "Numero de cuenta: " + numCuenta + " Saldo: " + saldo;
	}
	
	
}

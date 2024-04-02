package ejercicio2;
import static utiles.Utiles.*;

public class CuentaBancaria {
	
	private String numCuenta;
	private double saldo;
	private static double cantInicial = MIN_CANT_APERT;

	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			setSaldo(getSaldo()+ cantidad);
		saldo += cantidad;
		
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getCantInicial() {
		return cantInicial;
	}

	private void setCantInicial(double cantInicial) {
		CuentaBancaria.cantInicial = cantInicial;
	}
	
	public CuentaBancaria(String numCuenta) {
		this(numCuenta, cantInicial);
		
	}
	
	public CuentaBancaria(String numCuenta, double ini){
		this.numCuenta=numCuenta;
		if(ini < cantInicial) {
			String mensajeError = "La cantidad es menor que la cantidad minima de " + cantInicial+ "Euros";
			throw new RuntimeException(mensajeError);
		} else
			
		setSaldo(ini);
	}
	
	public String toString() {
		return "Numero de cuenta " + numCuenta + " Con saldo " + saldo;
	}
	
	
}

package ejercicio1;

public class Cajero {

	public static void main(String[] args) {
		CuentaBancaria miCuentaMinima = null;
		CuentaBancaria micuentaConValor = null;
		try {
			
			miCuentaMinima = new CuentaBancaria("00000");
			System.out.println(miCuentaMinima);
			
			
			miCuentaMinima.retirar(25);
			miCuentaMinima.ingresar(25);
			System.out.println(miCuentaMinima);
			
			
			 micuentaConValor =  new CuentaBancaria("asdfg", 50);
			 System.out.println(micuentaConValor);
			
			
		} catch (Exception e) {
			
			System.out.println("Ooooooops!" + e.getMessage());
			
		}
		
		 System.out.println("Fin del programa");
		
	}
}

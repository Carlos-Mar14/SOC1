package Vehiculos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String marca = args[0];
		String modelo= args[1];
		int anyCompra= Integer.parseInt(args[2]);
		int cod_provincia = Integer.parseInt(args[3]);
		int num= Integer.parseInt(args[4]);
		String letra_adicional = args[5];
		float consum = Float.parseFloat(args[6]);
		
		
		Vehiculo vehiculo1 = new Vehiculo (marca, modelo, anyCompra, cod_provincia, num, letra_adicional, consum);
		System.out.println(vehiculo1);
		System.out.println(vehiculo1.autonomia(25));

		
		
		Scanner sc = new Scanner(System.in);
		
		int numPlazas = Integer.parseInt(args[7]);
		String extras = args[8];

		Cotxhe coche1 = new Cotxhe( numPlazas, extras );
		System.out.println("Extra: ");
		
	}

}

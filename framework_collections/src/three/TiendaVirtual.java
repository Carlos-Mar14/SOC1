package three;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Usuario {

}

class Carrito {

}

public class TiendaVirtual {

	Map<Usuario, Carrito> ventas = new HashMap<>();

	// Ventas semanales: 1 = lunes, 2 = martes, ...
	Map<Integer, Map<Usuario, Carrito>> ventasSemanales = new HashMap<>();

	public static void main(String[] args) {

		Map<Usuario, Carrito> lunes = Map.of(new Usuario(), new Carrito(), new Usuario(), new Carrito());
		
		facturar(1, lunes);
	}

	private static void facturar(int i, Map<Usuario, Carrito> dia) {
		System.out.println("Dia: " + i);
		for(Entry<Usuario, Carrito> entrada: dia.entrySet()) {
			System.out.println(entrada.getKey());
			System.out.println(entrada.getValue());
		}
	}
}

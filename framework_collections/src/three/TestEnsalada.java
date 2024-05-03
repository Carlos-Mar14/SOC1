package three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEnsalada {

	public static void main(String[] args) {

		List<String> ensalada = new ArrayList<>(
				List.of("tomate", "tomate", "olivas", "atún", "tomate", "lechuga", "zanahoria", "tomate", "tomate"));
		/*
		 * ASI NO HAY QUE HACERLO for(int i=0; i<ensalada.size(); i++) { String
		 * ingrediente = ensalada.get(i); if(ingrediente.equals("tomate")) {
		 * ensalada.remove(i); System.out.println("Tomate quitado de la posicion " + i);
		 * } }
		 */

		Iterator<String> it = ensalada.iterator();
		int i = 0;
		while (it.hasNext()) {

			if (it.next().equals("tomate")) {
				it.remove();
				System.out.println("Tomate quitado de la posicion " + i);
			}
			i++;
		}

		System.out.println(ensalada);
	}
}

package three.patron_iterador;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Secuencia sec = new Secuencia(5);

		try {
			sec.add("viernes");
			sec.add(3);
			sec.add(new Date());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Iterable it = sec.getIterador();

		while (!it.end()) {
			Object obj = it.current();
			System.out.println(obj);
			it.next();

		}
		System.out.println("Programa finalizado");
	}

}

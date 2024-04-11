package buffer;

public class ComparativaBuilderVsBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 10_000_000; i++)
			sb.append("hola");
		
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo buffer:" + (fin - inicio) + "ms");

		// ************************************
		
		StringBuilder sbi = new StringBuilder();

		inicio = System.currentTimeMillis();

		for (int i = 0; i < 10_000_000; i++)
//		if ( i == 250_000) System.out.println("Voy por la mitad");
			sbi.append("hola");

		fin = System.currentTimeMillis();
		System.out.println("Tiempo String:" + (fin - inicio) + "ms");
	}
}

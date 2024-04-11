package buffer;

public class ComparativaStringVsBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		long inicio = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++)
			sb.append("hola");
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo buffer:" + (fin-inicio) + "ms");
		
		// ************************************
		String cadena="hola";
		
		inicio = System.currentTimeMillis();
		
		for(int i=0; i<1_000_000; i++)
//			if ( i == 250_000) System.out.println("Voy por la mitad");
			cadena +="hola";
		
		 fin = System.currentTimeMillis();
		System.out.println("Tiempo String:" + (fin-inicio) + "ms");
	}

}

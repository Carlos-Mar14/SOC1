package tipo_byte;

public class TipoByte {

	/*
	 * Recodatorio: el tipo byte va de -128 a 127
	 * Haciendo un tortal de 256 valores posibles
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * byte num = Byte.Max_value;
		 * num = (byte)(num + 1)
		 */
		
		imprimir(017); // 1* 8^1 + 7* 8^0 -> 8 + 7 = 15
		imprimir(0x91A); // 9 * 16^2 + 1 * 16^1 + 10 * 16^0 -> 9*256 + 1*16 + 10 = 2304 + 16 + 10 =2330
		imprimir(0b11);
		
		char caracter = '\u0065';
		System.out.println(caracter);
		
		System.out.println("esto es \" ");
		
		int num = 5;
		
		String nombre= "Carlos " + 
						"Andres " + num;
		
		System.out.println(nombre);
	}
	private static void imprimir(long num){
		System.out.println(num);
	}

}

package wrappers;

public class Testinteger {


	public static void main(String[] args) {
		
		//Integer num = Integer.valueOf(5);
		//System.out.println(5);
		//System.out.println(Integer.toBinaryString(5));
		
		String valor = args[0];
		Integer num1 = Integer.valueOf(valor); //Devuelve un Objet Integer
		Integer num2 = Integer.parseInt(valor); //Devuelve un tipo primitivo int,  // int num2 = Integer.parseInt(valor);
		
		imprimir(num1 == num2); //Expresion logica y solo devuelve true o false (Boolean)
		imprimir(num1.equals(num2));
	}
	
	static void imprimir(Object algo) {
		System.out.println(algo);
	}

}

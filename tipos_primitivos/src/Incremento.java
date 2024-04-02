
public class Incremento {

	public static void main(String[] args) {
		
		  int a = 0, b = 0; ++a; //b++;
		 
		  System.out.printf("a vale %d y b vale a %d", a);
		 

		/*
		 * 
		 * int a = 0, b = 0; ++a; b++; // Como se involucra el ++ a la izquirda en la
		 * impresion de // una expresion se suma la operacion de autoincremento
		 * System.out.printf("a vale %d y b vale a %d", ++a, b++);
		 * 
		 */

		/*
		
		int a = 0, b = 0;

		if (++a == ++b)
			System.out.println("Iguales");
		else
			System.out.println("Diferentes");

		System.out.printf("a vale %d y b vale a %d", a, b);
		
		*/
		
		/*
		int a = 0, b = 0;

		if (a > 0 && b == 0)
			System.out.println("Iguales");
		else
			System.out.println("Diferentes");

		System.out.printf("a vale %d y b vale a %d", a, b);
		*/
	}

}

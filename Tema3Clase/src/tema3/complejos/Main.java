package tema3.complejos;

public class Main {

	public static void main(String[] args) {
		// Creamos dos objetos "Complejo"
		Complejo c1 = new Complejo(3,5);
		//Complejo c2 = new Complejo(3,5);
		Complejo c2 = c1.copion();

		System.out.println(c1);
		System.out.println(c2);
		
		if(c1 == c2){
			System.out.println("c1 y c2 son iguales");
		} else {
			System.out.println("c2 y c2 son diferentes");
		}
		
		if(c1.equals(c2)){
			System.out.println("c1 y c2 son iguales");
		} else {
			System.out.println("c2 y c2 son diferentes");
		}
	}

}

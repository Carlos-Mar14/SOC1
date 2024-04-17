package coches;

import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		Coche coche = Coche.LAMBORGHINI;
//		System.out.println(coche);
//
//		for(Coche car: coche.values()) {
//			System.out.println(car);
//		}
		
		Coche random = getRandomCar();
		System.out.println(random);
		
		switch(random) {
		case FERRARI:
			break;
		case LAMBORGHINI:
			break;
		case PORSCHE:
			break;
		default:
			break;
		
		}
	}

	private static Coche getRandomCar() {
		Random numero = new Random();
		int num = numero.nextInt(2);
		
		return Coche.values()[num];
	}

}

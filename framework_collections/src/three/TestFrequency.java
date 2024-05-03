package three;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestFrequency {

	public static void main(String[] args) {
		
		int key = 3;
		Collection<Integer> serie = List.of(2, 3, 1, 3);
		
		int times = Collections.frequency(serie, key);
		
		System.out.printf("El %d aparece %d veces", key, times);
		
		System.out.println("\nMAX: " + Collections.max(serie));
		
		System.out.println("MIN: " + Collections.min(serie));
	}

}

package four.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

 private static Comparator<SmartPhone> COMP_BY_MODEL = new CompModel(){};
 private static Comparator<SmartPhone> COMP_BY_PRICE = new CompPrice(){};
	
	public static void main(String[] args) {
		List<SmartPhone> tels = new ArrayList<>();
		
		tels.add(new SmartPhone("Iphone", "14", 1200));
		tels.add(new SmartPhone("Samsung", "Galaxy", 1100));
		tels.add(new SmartPhone("Nokia", "ATamagochi", 20000));

		Collections.sort(tels, COMP_BY_PRICE);
		
		System.out.println(tels);
	}

}

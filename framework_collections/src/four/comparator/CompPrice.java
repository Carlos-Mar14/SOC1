package four.comparator;

import java.util.Comparator;

public class CompPrice implements Comparator<SmartPhone>{

	@Override
	public int compare(SmartPhone o1, SmartPhone o2) {
		return o1.getPrecio()-o2.getPrecio();
	}

}

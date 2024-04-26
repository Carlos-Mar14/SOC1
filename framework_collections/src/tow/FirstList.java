package tow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FirstList {

	public static void main(String[] args) {
		
		Set<Integer> conjunto = Set.of(67,33);
		List<Integer> nums = new ArrayList<>(List.of(45,22,36,12));
		nums.forEach(System.out::println);
		
		System.out.println("**************");
		Collections.sort(nums);
		nums.forEach(System.out::println);
	}

}

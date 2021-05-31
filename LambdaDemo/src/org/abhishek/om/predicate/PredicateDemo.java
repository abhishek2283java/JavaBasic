package org.abhishek.om.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		//Example 1 To test if a number is greater than 10
		Predicate<Integer> p = (i) -> (i > 10);
		System.out.println(p.test(10));
		
		//Example 2 To test if a String length is greater than 5
		Predicate<String> p1 = s -> (s.length() > 5);
		System.out.println(p1.test("Abhikriti"));
	}

}

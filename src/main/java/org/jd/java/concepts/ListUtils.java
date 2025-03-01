package org.jd.java.concepts;

import java.util.List;

public class ListUtils {

	public void listOperations() {
		
		List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		listOfNumbers.stream().filter(x -> x < 1 ).forEach(x -> {
			
		});
	}
}

package org.jd.java.concepts;

import java.util.HashMap;
import java.util.Map;

public class StringBuilderDemo {

	public void handle() {
		StringBuilder sbr = new StringBuilder();
		String input = "fdeugyyudsfgfyusdg423g2uyg32uy3";
				
		if ( input.trim().equals(sbr.reverse().toString().trim())) {
			System.out.println("The input is palindrome");
		}else {
			System.out.println("The number is not palindrome");
		}
		
		char[] charArray = input.toCharArray();
		Map<Character, Integer> duplicatesMap = new HashMap<>();
		for ( int i=0; i< charArray.length -1 ; i++) {
			var inputChar = charArray[i];
			int count = duplicatesMap.get(inputChar);
			if (duplicatesMap.get(inputChar) > 0 ) {
				duplicatesMap.put(inputChar, count+1);
			}else {
				duplicatesMap.put(inputChar, 1);
			}
		}
		
	}
	
	
}

package org.jd.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * 1071. Greatest Common Divisor of Strings
Easy
Topics
Companies
Hint

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""

 

Constraints:

    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of English uppercase letters.

 */
public class GreatestCommonAdvisor {

	   public String gcdOfStrings(String str1, String str2) {
		    System.out.println("GreatestCommonAdvisor: str1=" + str1 + " # str2="+str2 );
		   	String long_word = str1.length() >= str2.length()? str1 : str2;
		   	String short_word = str1.length() < str2.length()? str1 : str2;
			String result = "" , gcd = "";
			int i = short_word.length() - 1, j = 0;
			Map<Integer, String> mapOfGcd = new TreeMap<>();
			gcd = short_word;
			while( i >= 0 ) {
				if ( long_word.replaceAll(gcd, "").isBlank() && (short_word.replaceAll(gcd, "").isBlank()) ) {	
					System.out.println("GreatestCommonAdvisor: found string = "+ gcd);
					mapOfGcd.putIfAbsent(gcd.length(), gcd);
					result = gcd;
				}
				gcd = short_word.substring(0, short_word.length() - i);
				i--;j++;
			}
			System.out.println("mapOfGcd size="+mapOfGcd.size()); 
			mapOfGcd.entrySet().forEach(entry -> System.out.println( "GCD EntryValue - " + entry.getValue() + " | Key -" + entry.getKey()));
			
			result = mapOfGcd.isEmpty()? "" : mapOfGcd.entrySet().stream().max( Map.Entry.comparingByKey()).get().getValue();
			System.out.println("GreatestCommonAdvisor: gcdOfStrings result = "+ result);	
			return result;
	    }
	
}

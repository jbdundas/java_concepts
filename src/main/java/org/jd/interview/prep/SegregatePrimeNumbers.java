package org.jd.interview.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegregatePrimeNumbers {

	// Segregate Prime and Non-Prime Numbers in an array
	public void segregateNumbers() {
		 int [] arr = {2, 5, 9, 6, 7, 13, 24, 42, 8};
	     int [] arr1 = new int[4];
	     int [] arr2 = new int[arr.length - arr1.length];
	     
	     List<Integer> unprocessedList = new ArrayList<> (Arrays.stream(arr).boxed().toList());
	     List<Integer> listOfPrimeNumbers = unprocessedList.stream().filter( x -> isPrime(x)).toList();
	     unprocessedList.removeAll(listOfPrimeNumbers);
	     
	     List<Integer> result = new ArrayList<>();
	     result.addAll(listOfPrimeNumbers);
	     result.addAll(unprocessedList);
	     
	     int[] finalResult = result.stream().mapToInt( x -> x.intValue()).toArray();
	     
	     for ( int i=0; i< finalResult.length; i++) {
	    	 System.out.println(finalResult[i]);
	     }
	     
	     
	}
	
	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for ( int i = 2; i < Math.sqrt(number); i++) {
	        	
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}

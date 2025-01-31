package org.jd.interview.prep;

import java.util.Arrays;
import java.util.stream.IntStream;

//Without sorting, find if the elements in the array are consecutive.
public class NonConsecutiveNumbersInArray {

	//without sorting and in one loop of calculation.
	public void assertAreConsecutiveElemsPresentInArray(int[] arr) {
		
		int max = 0,min = 0;
		int sum = 0;
		for ( int i=0;i< arr.length; i++) {
				max = arr[i] > max ? arr[i] : max ;
				min = arr[i] < min ? arr[i] : min ;
				sum =  sum + arr[i];
		}
		
		int sum2 = IntStream.rangeClosed(min,max).sum();
		if ( sum == sum2 ) {
			System.out.println(" The input array " + Arrays.toString(arr) + " has consecutive sequential elements.");
		}else {
			System.out.println(" The input array " + Arrays.toString(arr) + " is not having consecutive sequential elements.");
		}
		
	}
}

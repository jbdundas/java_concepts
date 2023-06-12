/**
 * 
 */
package org.jd.java.collectors;

import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 * @author jitesh dundas
 *
 */
public class ReducingExample<T> {
	
	public static final Logger log = Logger.getLogger("ReducingExample");
	
	public void sumOfIntegers(int count) {
	 OptionalInt sumOfEvenNumbers = IntStream.range(1, count)
			.filter(number -> ((number%2) == 0))
			.reduce( (a,b) -> a+b );
	 
	 sumOfEvenNumbers.ifPresentOrElse(
			 sum -> {
				 log.log(Level.INFO, "Sum of even integers from 1 to 100 is {0}",sum);
			 },
			 () -> {
				 log.log(Level.SEVERE, "Exception occurred: Sum of even integers from 1 to 100 could not be found.");
			 });
	}
	
	//fund the sum of even integers using the second way in streams i.e. the sum() method.
	public void sumOfIntegersUsingSum(int count) {
		
		//define the predicate.
		IntPredicate isEvenPredicate = (number) ->  ((number % 2) == 0);
		//define the range from 1 until the count.
		var sumOfEvenIntegers = IntStream.range(1, count)
		//filter the stream to process only even numbers using the isEvenPredicate.
		.filter(isEvenPredicate)
		//calculate using the same.
		.sum();
		
		log.log(Level.INFO, "Sum of even integers from 1 to 100 is {0}",sumOfEvenIntegers);
		
	}
	
}

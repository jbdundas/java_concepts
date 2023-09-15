package org.jd.leetcode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

 

Constraints:

    1 <= nums.length <= 1000
    -10^6 <= nums[i] <= 10^6

 */
public class RunningSum {
	
	public int[] execute(int[] input) {
		System.out.println("Start RunningSum class.");
		//1. fetch the total count of digits
		//2. next, take each element and it's index ( called sumIndex).
		//3. run a loop to sum all elements upto this sumIndex.
		//4. store the value of the sum and the element value in the sumIndex.
		//5. move to the next sumIndex and repeat steps 1 through 5. 
		int[] result = IntStream.range(0, input.length).map( i -> {
			int sum = 0;
			for ( int j=0; j< i ; j++ ) {
				sum = sum + input[j];
			}
			return sum;
		}).peek(x -> System.out.println(x)).toArray();
		
		System.out.println("Result --> " + result.toString());
		return result;
	}
}

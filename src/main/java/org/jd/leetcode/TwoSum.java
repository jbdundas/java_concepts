/**
 * 
 */
package org.jd.leetcode;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 1. Two Sum
Easy
51.1K
1.6K
Companies
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {

	public static final Logger log = Logger.getLogger(TwoSum.class.getName());
	private static final int SKIP = -1111;
	int first = 0;
	int second = 0;
	int sum = 0;
	
	/*
	 * 1. Iterate in a loop
	 * 2. Fetch the first and second elements.
	 * 3. Calculate their sum and check if it is equal to the target variable. If yes, print this as the result, break the loop and end the program.
	 * 4. If not, compare the first one and the third one and repeat steps 2 and 3 respectively.
	 * 5. After all the numbers in the array are matched with the first element, remove it from consideration and replace it with the second one. 
	 * 6. Using the second one and the rest of the elements in the array , repeat steps 2 and 3 of this pseudo-code. 
	 * 7. Repeat steps   
	 */
	public int[] twoSum(int[] nums, int target) {
		
		int i = 0,j = 0;
		j = i; 
		
		if ( j < nums.length ) {
			isMatchFound(nums, target, j);
			j++;
		}
		i++;
		
        return IntStream.of(0).toArray();
    }
	
	private boolean isMatchFound(int[] nums, int target, int j) {
			
		first = nums[j];
		second = nums[j+1];
	
		sum = first + second;
		if ( sum == target ) {
			log.log(Level.INFO, "Result found --> {0} {1} which sum equal to {3} ", new Object[] {first, second, sum} );
			return true;
		}else {
			log.log(Level.INFO, "Result not found --> {0} {1} which sum equal to {3} ", new Object[] {first, second, sum} );
			return false;
		}
					
		
	}

}

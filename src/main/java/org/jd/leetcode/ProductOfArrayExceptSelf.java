package org.jd.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 238. Product of Array Except Self
Medium
Topics
Companies
Hint

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums 
except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 

Constraints:

    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

 */
public class ProductOfArrayExceptSelf {
	//when the element is non-zero.
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int product = Arrays.stream(nums).reduce((x,y) -> x *y).getAsInt();
		IntStream.range(0, nums.length).forEach(x -> {
			result[x] = product / nums[x];
		});
		return result;
	}
	
	//situation when the element is zero.
	//In progress. 
	public int[] productExceptSelfIfZeroPresent(int[] nums) {
		int[] result = new int[nums.length];
		
		return result;
	}
}

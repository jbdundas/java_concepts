package org.jd.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

/*
 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

 

Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

 */
public class ReverseWordsInString {
	public String reverseWords(String s) {
		return Arrays.asList(s.trim().split(" ")).reversed().stream().reduce((x, y) -> x.trim() + " " + y.trim()).get();
	}
	
	
	//Space Complexity for this approach is O(N).
	public String reverseWordsIteratively(String s) {
		String[] words = s.trim().split(" ");
		String result = "";
		
		for (int i = words.length - 1; i >= 0; i--) {
			if (i >= 0) {
				result = result.trim() + " " + words[i].trim();
			}
		}
		System.out.println("reverseWordsIteratively result = " + result);
		return result.trim();
	}
	
	StringBuilder resultSB = new StringBuilder();
	
	public String reverseRecursively(String s) {
		
		String words[] = s.split(" ");
		String result = callRecursively(words.length-1,words);
		System.out.println("reverseRecursively = "+ result);
		return result;
	}


	private String callRecursively(int i,String[] words) {
		if ( i >= 0 ) {
			resultSB.append(words[i] + " ");
			i--;
			callRecursively(i,words);
		}
		return resultSB.toString().trim();
	}
	

}

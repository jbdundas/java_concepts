package org.jd.leetcode;

import java.util.Arrays;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.

 */

//Work In Progress. 
public class ReverseVowelsInString {

  public String reverseVowels(String s) {
	  System.out.println("Input: " + s.toString());
	  char[] inputArr = s.toCharArray();
	  int[] identifiedVowelsIndex = new int[inputArr.length];
	  char[] vowelsFound = new char[inputArr.length];
			  
	  String vowels = "aeiouAEIOU";
	  //int start = 0, end = inputArr.length - 1;
	  int j = 0;
	  for ( int i=0; i< inputArr.length - 1 ; i++) {
		  char inputChar = inputArr[i];
		  //is the found character is a vowel?
		  if ( vowels.toString().indexOf(inputChar) != -1) {
			  //found a vowel. record it's position and value.
			  identifiedVowelsIndex[j] = i;
			  vowelsFound[j] = inputChar;
			  j++;
		  }
	  }
	  
	  var reversedArray = Arrays.asList(vowelsFound).reversed().toString().toCharArray();
	  for ( int i =0; i< identifiedVowelsIndex.length - 1; i++) {
		  inputArr[i] = reversedArray[i];
		  System.out.println(inputArr[i]);
	  }
	  
	  String result = new String(inputArr);
	  System.out.println("Result: " + result);
	  return result;
  }

}

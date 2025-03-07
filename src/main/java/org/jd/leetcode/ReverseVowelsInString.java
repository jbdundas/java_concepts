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

//Solution: https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/6507530/simple-on-complexity-solution-without-ne-63rr 
public class ReverseVowelsInString {

  public String reverseVowels(String s) {
	  System.out.println("Input: " + s.toString());
	  char[] inputArr = s.toCharArray();
	  int[] identifiedVowelsIndex = new int[inputArr.length];
	  char[] vowelsFound = new char[inputArr.length];
			  
	  String vowels = "aeiouAEIOU";
	  int j = 0;
	  for ( int i=0; i< inputArr.length; i++) {
		  char inputChar = inputArr[i];
		  //is the found character is a vowel?
		  if ( vowels.toString().indexOf(inputChar) != -1) {
			  //found a vowel. record it's position and value.
			  identifiedVowelsIndex[j] = i;
			  vowelsFound[j] = inputChar;
			  j++;
		  }
	  }
	  
	  //reverse the order of the found vowels.
	  var vowelsFound2 = Arrays.copyOf(vowelsFound,j);
	  System.out.println("vowelsFound2="+ String.valueOf(vowelsFound2) + "  with size = "+ vowelsFound2.length);
	  var reversedArray = new StringBuilder(String.valueOf(vowelsFound2)).reverse().toString().toCharArray();
	  System.out.println("reversedArray="+ String.valueOf(reversedArray) + "  with size = "+ reversedArray.length);
	  for ( int i = 0; i <= j-1 ; i++) {
		  var position = identifiedVowelsIndex[i];
		  System.out.println("position="+position + " i="+ i + " reversedArray[" + i + "]=="+reversedArray[i]);
		  inputArr[position] = reversedArray[i];
	  }
		
	  String result = new String(inputArr);
	  System.out.println("Result: " + result);
	  return result;
  }

}

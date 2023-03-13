package com.jd.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 */
public class IsSubSequence {

	/*
	 * Steps:
	 * 
	 */
	public boolean isSubsequence(String s, String t) {
		
		boolean isIsoMorphic = Boolean.FALSE;
		char[] sArr = s.toCharArray();
		Map<Character, Integer > posMap = new HashMap<Character, Integer>();
		//loop through each substring character and replace it in source string.
		for (int i=0;i<sArr.length;i++) {
			Character sToReplace = sArr[i];
			System.out.println("s Char:"+ sToReplace);
			//find character s in destination array
			 int positionOfChar = t.indexOf(sToReplace) ;
			 if ( positionOfChar != -1) {
				 posMap.put(sToReplace, positionOfChar);
			 }
			
		}
		
		if (posMap.size() == sArr.length) {
			isIsoMorphic = Boolean.TRUE;
		}
		System.out.println("s="+ s + " t="+t + " isIsoMorphic="+ isIsoMorphic);
		return isIsoMorphic;
	}

}
package org.jd.leetcode;

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
	 * 16/18 test cases passed in leetcode. url:
	 * https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1
	 * 
	 */
	public boolean isSubsequence(String s, String t) {
		System.out.println("s=" + s + " t=" + t);
		boolean isIsoMorphic = Boolean.FALSE;
		char[] sArr = s.toCharArray();
		char[] tArr = s.toCharArray();
		int sCharPositionFoundAt = -1;
		int sPreviosCharPositionFoundAt = -1;
		Map<Character, Integer> posMap = new HashMap<Character, Integer>();
		// loop through each substring character and replace it in source string.
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(" Iteration START:" + "i=" + i + " # posMap size=" + posMap.size());
			Character sToReplace = sArr[i];
			System.out.println("s Char:" + sToReplace);
			// find character s in destination array

			// if the map already has the character from earlier iteration, then skip this
			// one.
			if (posMap.get(sToReplace) != null) {
				// i = t.indexOf(sToReplace);
				continue;
			} else {

				sCharPositionFoundAt = t.indexOf(sToReplace);
				System.out.println("i=" + i + ") sCharPositionFoundAt:" + t.indexOf(sToReplace)
						+ " sPreviosCharPositionFoundAt =" + sPreviosCharPositionFoundAt);

				if (t.indexOf(sToReplace) != -1) { // character was found in the string.

					// is this character found before the last occurence. If yes, then skip it.
					if (sCharPositionFoundAt > sPreviosCharPositionFoundAt) {
						posMap.put(sToReplace, t.indexOf(sToReplace));
						sPreviosCharPositionFoundAt = sCharPositionFoundAt;
					}

					

				}
			}
			System.out.println(" Iteration END:" + "i=" + i + " # posMap size=" + posMap.size() + " # sToReplace="
					+ sToReplace + " sCharPositionFoundAt:" + t.indexOf(sToReplace));
		}

		if (posMap.size() == sArr.length) {
			isIsoMorphic = Boolean.TRUE;
		} else {
			isIsoMorphic = Boolean.FALSE;
		}
		System.out.println("s=" + s + " t=" + t + " isIsoMorphic=" + isIsoMorphic);
		System.out.println("=============================================================");
		return isIsoMorphic;
	}

}

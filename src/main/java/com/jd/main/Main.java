package com.jd.main;

import com.jd.leetcode.IsSubSequence;

public class Main {

	public static void main(String[] args) {
		IsSubSequence isSubSequence = new IsSubSequence();
		//isSubSequence.isSubsequence("abc","ahbgdc");//CORRECT
		//isSubSequence.isSubsequence( "axc","ahbgdc");//CORRECT
		//isSubSequence.isSubsequence("acb","ahbgdc"); //WRONG ANSWERR. It should be false.
		isSubSequence.isSubsequence("ab", "baab");
	}

}

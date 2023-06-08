package com.jd.main;

import org.jd.java.collectors.GroupingByExample;

import com.jd.leetcode.IsSubSequence;
import com.jd.prep.java.StreamsExample;

public class Main {

	public static void main(String[] args) {
		generateSubSequence();
		
		generateFlatMap(); 
		
		GroupingByExample groupingByExample = new GroupingByExample();
		groupingByExample.printEmployeesCountByDept(100);
		
		groupingByExample.printEmployeesByDept(100);
		
	}

	private static void generateFlatMap() {
		//Examples about Java Streams.
		StreamsExample streams1 = new StreamsExample();
		streams1.testFlatMap();
	}

	private static void generateSubSequence() {
		IsSubSequence isSubSequence = new IsSubSequence();
		isSubSequence.isSubsequence("abc","ahbgdc");
		isSubSequence.isSubsequence( "axc","ahbgdc");
		isSubSequence.isSubsequence("acb","ahbgdc"); 
		isSubSequence.isSubsequence("ab", "baab");
	}
	
	
}

package com.jd.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jd.java.collectors.GroupingByExample;

import com.jd.leetcode.IsSubSequence;
import com.jd.prep.java.CharacterOccurence;
import com.jd.prep.java.StreamsExample;

public class Main {

	public static final Logger log = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		printLineSeparator();
		generateSubSequence();
		
		printLineSeparator();
		generateFlatMap(); 
		
		printLineSeparator();	
		GroupingByExample groupingByExample = new GroupingByExample();
		groupingByExample.printEmployeesCountByDept(100);
		
		printLineSeparator();
		groupingByExample.printEmployeesByDept(100);
		
		printLineSeparator();
		CharacterOccurence characterOccurence = new CharacterOccurence();
		characterOccurence.stringOccurence("hello");
		
		printLineSeparator();
	}

	private static void printLineSeparator() {
		log.log(Level.INFO, "--------------------------------------------");
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

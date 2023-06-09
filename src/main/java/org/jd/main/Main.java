package org.jd.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jd.java.collectors.CharacterOccurence;
import org.jd.java.collectors.FlatMapExample;
import org.jd.java.collectors.GroupingByExample;
import org.jd.leetcode.IsSubSequence;

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
		FlatMapExample streams1 = new FlatMapExample();
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

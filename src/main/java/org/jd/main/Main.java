package org.jd.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jd.java.collectors.CharacterOccurence;
import org.jd.java.collectors.FlatMapExample;
import org.jd.java.collectors.GroupingByExample;
import org.jd.java.collectors.ReducingExample;
import org.jd.leetcode.IsSubSequence;
import org.jd.leetcode.ReverseLinkedList;

public class Main {

	public static final Logger log = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		//reverseLinkedList.reverseList(new int[] {1,2,3});
		printLineSeparator();
		
		//solveLeetCodeProblems();
		//solveJavaConceptualProblems();
	}

	private static void solveLeetCodeProblems() {
		generateSubSequence();
		printLineSeparator();
		
		CharacterOccurence characterOccurence = new CharacterOccurence();
		characterOccurence.stringOccurence("hello");
		printLineSeparator();
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		reverseLinkedList.reverseList(new int[] {1,2,3});
		printLineSeparator();

	}

	private static void solveJavaConceptualProblems() {
		generateFlatMap(); 
		printLineSeparator();	
		
		GroupingByExample groupingByExample = new GroupingByExample();
		groupingByExample.printEmployeesCountByDept(100);
		printLineSeparator();
		
		groupingByExample.printEmployeesByDept(100);
		printLineSeparator();
		
		ReducingExample<Integer> reducingExample = new ReducingExample<Integer>();
		reducingExample.sumOfIntegers(101);
		reducingExample.sumOfIntegersUsingSum(101);
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

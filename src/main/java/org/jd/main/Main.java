package org.jd.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jd.interview.prep.SegregatePrimeNumbers;
import org.jd.java.collectors.CharacterOccurence;
import org.jd.java.collectors.FlatMapExample;
import org.jd.java.collectors.GroupingByExample;
import org.jd.java.collectors.ReducingExample;
import org.jd.leetcode.CanPlaceFlowers;
import org.jd.leetcode.GreatestCommonAdvisor;
import org.jd.leetcode.IsSubSequence;
import org.jd.leetcode.KidsWithGreatestNumberOfCandies;
import org.jd.leetcode.MergeStringAlternatively;
import org.jd.leetcode.ReverseLinkedList;
import org.jd.leetcode.RunningSum;
import org.jd.leetcode.VerticalMoveTest;

import junit.framework.Assert;

public class Main {

	public static final Logger log = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		
		SegregatePrimeNumbers segregatePrimeNumbers = new SegregatePrimeNumbers();
		segregatePrimeNumbers.segregateNumbers();
		
		solveLeetCodeProblems();
		solveJavaConceptualProblems();
		
		VerticalMoveTest test = new VerticalMoveTest();
		test.start();
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		reverseLinkedList.reverseList(new int[] {1,2,3});
		printLineSeparator();
		
		
		RunningSum runningSum = new RunningSum();
		int[] input = new int[] {1,2,3,4};
		runningSum.execute(input);
		
		
		
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
		
		MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
		Assert.assertEquals(mergeStringAlternatively.mergeAlternately("abc", "pqr"), "apbqcr");
		Assert.assertEquals(mergeStringAlternatively.mergeAlternately("ab", "pqrs"), "apbqrs");
		Assert.assertEquals(mergeStringAlternatively.mergeAlternately("abcd", "pq"), "apbqcd");
		printLineSeparator();
		
		GreatestCommonAdvisor greatestCommonAdvisor = new GreatestCommonAdvisor();
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("ABCABC", "ABC"),"ABC");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("ABABAB", "ABAB"),"AB");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("LEET", "CODE"),"");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"), "TAUXX");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("AA", "A"),"A");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("AAAAAAAAA", "AAACCC"),"");
		Assert.assertEquals(greatestCommonAdvisor.gcdOfStrings("ABABABAB", "ABAB"),"ABAB");
		printLineSeparator();
		
		KidsWithGreatestNumberOfCandies kidsWithGreatestNumberOfCandies = new KidsWithGreatestNumberOfCandies();
		//Input: candies = [2,3,5,1,3], extraCandies = 3 . Output: [true,true,true,false,true] 
		Assert.assertEquals(kidsWithGreatestNumberOfCandies.kidsWithCandies(new int[] {2,3,5,1,3} , 3), new boolean[] {true,true,true,false,true} );
		printLineSeparator();
		
		CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
		canPlaceFlowers.canPlaceFlowers(null, 0);
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

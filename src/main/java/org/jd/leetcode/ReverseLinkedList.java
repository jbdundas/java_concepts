/**
 * 
 */
package org.jd.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author jbdundas
 * @date 25 July 2023
 * 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * @param <T>
 */
public class ReverseLinkedList {
	
	public Logger log = Logger.getLogger("ReverseLinkedList");
	
	public void reverseList(int[] arr) {
		reverseListUsingJavaStreams(arr);
	}
	
	public void reverseListUsingJavaStreams(int[] arr) {
		log.log(Level.INFO,"Original list is as follows-------------------------------------------");
		printArray(arr);
		List<Integer> reversedListUsingJavaCollections = IntStream.of(arr).boxed().toList();
		reversedListUsingJavaCollections.stream().sorted(Collections.reverseOrder()).toList();
		log.log(Level.INFO,"Reversed list is as follows-------------------------------------------");
		reversedListUsingJavaCollections.forEach( x -> log.log(Level.INFO,"Element --> {0}",x.toString()));
		
	}

	private void printArray(int[] arr) {
		for ( int i : arr)
			log.log(Level.INFO,"Element --> {0}",i);
	}
	
    public ListNode reverseList(ListNode head) {
		return head;
    }
	

	class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

}

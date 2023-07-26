/**
 * 
 */
package org.jd.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 * 
 * @param <T>
 */
public class ReverseLinkedList {

	public Logger log = Logger.getLogger("ReverseLinkedList");

	private ListNode previousNode;

	private ListNode node;

	public ListNode getNode() {
		return node;
	}

	public void setNode(ListNode node) {
		this.node = node;
	}

	public ListNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(ListNode previousNode) {
		this.previousNode = previousNode;
	}

	public void reverseList(int[] arr) {
		reverseListUsingJavaStreams(arr);
		reverseListWithoutJavaStreams(arr);
	}

	private ListNode reverseListWithoutJavaStreams(int[] arr) {
		log.log(Level.INFO, "Initiate reverseListWithoutJavaStreams-------------------------------------------");
		List<ListNode> nodes = new LinkedList<ListNode>();

		int size = arr.length - 1;
		ListNode previousNode = null;

		// iterate from last index to the first one.
		for (int i = size; i > -1; i--) {
			if (i == size) {
				setNode(new ListNode(arr[size], null));
				setPreviousNode(getNode());
			} else {
				setNode(new ListNode(arr[i], getPreviousNode()));
				setPreviousNode(node);
			}
			log.log(Level.INFO, "Answer --> {0}", node.toString());
		}

		log.log(Level.INFO, "Terminate reverseListWithoutJavaStreams-------------------------------------------");
		return getNode();
	}

	public void reverseListUsingJavaStreams(int[] arr) {
		log.log(Level.INFO, "Original list is as follows-------------------------------------------");
		printArray(arr);
		List<Integer> reversedListUsingJavaCollections = IntStream.of(arr).boxed().toList();
		var newList = reversedListUsingJavaCollections.stream().sorted(Collections.reverseOrder()).toList();
		log.log(Level.INFO, "Reversed list is as follows-------------------------------------------");
		newList.forEach(x -> log.log(Level.INFO, "Element --> {0}", x.toString()));
	}

	private void printArray(int[] arr) {
		for (int i : arr)
			log.log(Level.INFO, "Element --> {0}", i);
	}

	public void printList(List<ListNode> nodes) {
		nodes.forEach(x -> log.log(Level.INFO, "Answer --> {0}", x.toString()));
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

}

//206. Reverse Linked List, Iteration , O(n)

class Solution {
    public ListNode reverseList(ListNode head) {
    	//initialize all 'ListNode's
    	ListNode prev = null;
    	ListNode curr = head;
    	ListNode tempNext = null;
    	while (curr != null) {
    		//save curr.next to temp
    		tempNext = curr.next;
    		//reverse the pointing direction
    		curr.next = prev;
    		//move curr
    		prev = curr;
    		curr = tempNext;
    	}
    	//when everything finishes, prev is the head
    	return prev;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
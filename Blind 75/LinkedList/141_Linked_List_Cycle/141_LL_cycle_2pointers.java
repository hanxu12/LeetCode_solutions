//141. Linked List Cycle, slow+fast_ pointers, O(n)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
        	return false;
        }
        ListNode slow_ptr = head;
        ListNode fast_ptr = head.next;

        while (slow_ptr != fast_ptr) {
        	if (fast_ptr == null || fast_ptr.next == null) {
        		return false;
        	}
        	slow_ptr = slow_ptr.next;
        	fast_ptr = fast_ptr.next.next;
        }
        return true;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
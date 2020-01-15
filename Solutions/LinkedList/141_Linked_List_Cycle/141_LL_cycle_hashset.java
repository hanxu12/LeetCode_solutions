//141. Linked List Cycle, HashSet, O(n)
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> traversed = new HashSet<>();

        while (head != null) {
            if (traversed.contains(head)) {
                return true;
            } else {
                traversed.add(head);
            }
            head = head.next;
        }
        return false;
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
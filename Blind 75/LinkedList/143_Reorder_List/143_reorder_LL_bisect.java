//143. Reorder List, fast+slow ptr/ cut LL into 2 subLLs, O(n)
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        //head of 1st half
        ListNode l1 = head;
        //head of 2nd half
        ListNode slow = head;
        //tail of 2nd half
        ListNode fast = head;
        //tail of 1st half
        ListNode l1_tail = null;

        //below makes slow ptr at the mid of the original LL
        while (fast != null && fast.next != null) {
            l1_tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        l1_tail.next = null;
        //reverse the 2nd half
        ListNode l2 = reverse(slow);
        //merge accordingly
        merge(l1, l2);
    }

    private ListNode reverse(ListNode head) {

        ListNode prev =null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            //save the next
            next = curr.next;
            //reverse the pointer direction
            curr.next = prev;
            //advance curr & next pointers
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            l1.next = l2;

            if (l1_next == null){
                break;
            } else{
                l2.next = l1_next;
                l1 = l1_next;
                l2 = l2_next;
            }
        }
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
// Last updated: 1/19/2026, 10:36:16 PM
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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        boolean hopSlow = true;

        while(fast != null&& fast.next != null)
        {
            fast = fast.next;
            hopSlow = !hopSlow;
            if(hopSlow) slow = slow.next;
            if(fast.next == slow || slow == fast) return true;
        }
        return false;

    }
}
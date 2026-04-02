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

public class Code61 {

    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //slow moves by +1
            fast=fast.next.next;  //fast moves by +2

            if(slow==fast){  //detect cycle
                return true; //cycle exists
            }

        }
        return false;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Code66{
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null)return null;
        ListNode temp = new ListNode(0);
        temp.next=head;
        ListNode pre = temp;
        for(int i=0;i<left-1;i++) pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;
        for(int i=0;i<right-left;i++){
            start.next=then.next;
            then.next=pre.next;
            pre.next=then;
            then=start.next;
        }
        return temp.next;
    }
}
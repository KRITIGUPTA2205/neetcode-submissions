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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummy=new ListNode(0);
         dummy.next=head;
         ListNode temp=head;
         int size=0;
         while(temp!=null){
           size++;
           temp=temp.next;
         }
         int prev=size-n;
         temp=dummy;
         while(prev!=0){
            temp=temp.next;
            prev--;
         }
        temp.next=temp.next.next;
        return dummy.next;
    }
}

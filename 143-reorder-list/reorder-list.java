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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        return;
        //find middle node with the help of fast and slow pointer
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now slow pointer is at the middle position of the Linked list

        //now we will split the Linked List
        ListNode second=slow.next;
        slow.next=null;



        //now we have to reverse the Linked List
        ListNode prev=null;
        while(second!=null){
            ListNode next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null){
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;

            t1=m1;
            t2=m2;
        }
    }
}
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
    public int pairSum(ListNode head) {
        if(head==null||head.next==null)
        return head.val;
        ListNode slow=head;
        ListNode fast=head;
        ListNode head1=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode head2=prev;
        int max=0;
        while(head1!=null&&head2!=null){
        if(head1.val+head2.val>max){
            max=head1.val+head2.val;
        }
        head1=head1.next;
        head2=head2.next;
        }
        return max;
        
    }
}
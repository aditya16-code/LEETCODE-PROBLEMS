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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
        return head; 
        ListNode temp=head;
        int size=0;
        ListNode tail=head;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
            size=size+1;
        }
        int newK=k%size;
        if(newK==0){
            return head;
        }
        int diff=size-newK;
        ListNode curr=head;
        for(int i=0;i<diff-1;i++){
            curr=curr.next;
        }
        ListNode newhead=curr.next;
        curr.next=null;
        tail.next=head;
        return newhead;
    }

}
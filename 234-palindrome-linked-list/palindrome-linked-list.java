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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        //find middle of LL
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now slow is at the middle of LL
        //reverse second half (i.e starting from slow.next)
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            if(left.val!=right.val)
            return false;
            left=left.next;
            right=right.next;
        }
        return true;

        }

    }

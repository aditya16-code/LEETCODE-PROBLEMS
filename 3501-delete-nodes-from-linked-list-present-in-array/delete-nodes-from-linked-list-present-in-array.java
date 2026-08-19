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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head.next==null)
        return head;
        ListNode curr=head;
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        Set<Integer>set=new HashSet<>();
        int i=0;
        while(i<nums.length){
            set.add(nums[i]);
            i++;
        }
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=curr;
            curr=curr.next;
            }
            
        }
        return dummy.next;

    }
}
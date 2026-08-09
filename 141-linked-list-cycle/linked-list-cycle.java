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
        if(head==null)
        return false;
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(slow!=fast){
            if(fast==null||fast.next==null)
            return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==slow)
        return true;
        return false;
    }

}
/**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         Set<ListNode>set=new HashSet<>();
//         ListNode curr=head;
//         while(curr!=null){
//         if(set.contains(curr)){
//              return true;}
//         set.add(curr);
//         curr=curr.next;
//         }
//         return false;
        
//     }
// }
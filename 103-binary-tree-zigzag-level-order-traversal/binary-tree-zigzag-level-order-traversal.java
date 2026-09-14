/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new LinkedList<List<Integer>>();
        if (root==null)return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        boolean direction=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>sublist=new ArrayList<>();
         for(int i=0;i<size;i++){
            TreeNode node=queue.poll();
            sublist.add(node.val);
            if(node.left!=null)
            queue.offer(node.left);
            if(node.right!=null)
            queue.offer(node.right);

        }
        if(!direction){
            Collections.reverse(sublist);
        }
        list.add(sublist);
        direction=!direction;
        }
        return list;
    }
}
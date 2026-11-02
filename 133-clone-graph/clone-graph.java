/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
         Node visited[]=new Node[101];
         Stack<Node>stack= new Stack<>();


         visited[node.val]=new Node(node.val);
         stack.push(node);
         while(!stack.isEmpty()){
            Node cur=stack.pop();

            for(Node nei:cur.neighbors){
                if(visited[nei.val]==null){
                    visited[nei.val]= new Node(nei.val);
                    stack.push(nei);
                }
                visited[cur.val].neighbors.add(visited[nei.val]);
            }

         }
        return visited[node.val];
    }
}
class Solution {
    private Map<Node, Node> cloned = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // 1. Already cloned? Reuse it (this stops cycles)
        if (cloned.containsKey(node)) {
            return cloned.get(node);
        }

        // 2. Create the clone and register it BEFORE visiting neighbors
        Node copy = new Node(node.val);
        cloned.put(node, copy);

        // 3. Clone every neighbor (recursively) and attach it
        for (Node nei : node.neighbors) {
            copy.neighbors.add(cloneGraph(nei));
        }

        // 4. Return the finished clone
        return copy;
    }
}
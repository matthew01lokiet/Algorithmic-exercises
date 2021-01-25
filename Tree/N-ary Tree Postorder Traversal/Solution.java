/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    private List<Integer> toRet = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        
        if(root == null)
            return toRet;
        
        postorderTrav(root);
        
        return toRet;
        
    }

    public void postorderTrav(Node root)
    {
        
        if(root.children != null)
            for(Node child : root.children)
                postorderTrav(child);
        
        if(root != null)
            toRet.add(root.val);
    }
    
}
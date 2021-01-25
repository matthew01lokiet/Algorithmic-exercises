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
class BSTIterator {
    
    private List<Integer> inOrder = new ArrayList<>();

    private int incr = -1;
    
    public BSTIterator(TreeNode root) {
        
        traversInOrder(root);
        
    }
    
    public int next() {
    
        incr++;
        int ret = inOrder.get(incr);
        
        return ret;
        
    }
    
    public boolean hasNext() {
        
        if(incr + 1 == inOrder.size())
            return false;
        else
            return true;
        
    }
    
    public void traversInOrder(TreeNode root)
    {
        
        if( root.left != null )
        {
            traversInOrder(root.left);
        }
        
        
        inOrder.add(root.val);
        
        
        if( root.right != null )
        {
            traversInOrder(root.right);
        }
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
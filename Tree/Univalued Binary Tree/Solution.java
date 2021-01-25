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
    
    private int[] val;
    private boolean is = true;
    
    public boolean isUnivalTree(TreeNode root) {
        
        traversInOrder(root);
        
        return is;
        
    }
    
    public void traversInOrder(TreeNode node)
    {
        // left child subtree
        if( node.left != null )
        {
            traversInOrder(node.left);
        }
        
        if(val == null)
        {
            val = new int[1];
            val[0] = node.val;
        }
        else
            if(val[0] != node.val)
                is = false;
        
        
        // right child subtree
        if( node.right != null )
        {
            traversInOrder(node.right);
        }
        
    }
}
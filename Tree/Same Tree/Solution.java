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
    
    private boolean areEqual = true;
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q == null)
            return true;
        else if(p == null ^ q == null)
            return false;
        
        traversInOrder(p,q);
        
        return areEqual;
        
    }
    
    public void traversInOrder(TreeNode node1, TreeNode node2)
    {
        
        if( node1.left != null && node2.left != null )
        {
            traversInOrder(node1.left, node2.left);
        }
        else if( (node1.left == null && node2.left != null) || (node1.left != null && node2.left == null))
        {
            areEqual = false;
            return;
        }
        
        
        if(node1.val != node2.val)
        {
            areEqual = false;
            return;
        }
        
        
        if( node1.right != null && node2.right != null )
        {
            traversInOrder(node1.right, node2.right);
        }
        else if( (node1.right == null && node2.right != null) || (node1.right != null && node2.right == null))
        {
            areEqual = false;
            return;
        }
        
    }
}
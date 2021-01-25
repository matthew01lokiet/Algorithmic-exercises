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
    
    private TreeNode retNode;
    private TreeNode incrSearchNode;
    
    public TreeNode increasingBST(TreeNode root) {
        
        if(root == null)
            return null;
        
        retNode = new TreeNode();
        
        traversInOrder(root);
        
        return retNode.right;
        
    }
    
    public void traversInOrder(TreeNode node)
    {
        // left child subtree
        if( node.left != null )
        {
            traversInOrder(node.left);
        }
        
        if(incrSearchNode == null)
        {
            incrSearchNode = new TreeNode(node.val);
            retNode.right = incrSearchNode;
        }
        else
        {
            incrSearchNode.right = new TreeNode(node.val);
            incrSearchNode = incrSearchNode.right;
        }
        
        // right child subtree
        if( node.right != null )
        {
            traversInOrder(node.right);
        }
        
    }
    
   
    
}
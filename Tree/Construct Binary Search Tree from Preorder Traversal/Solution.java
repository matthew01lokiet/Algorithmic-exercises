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
    
    public TreeNode bstFromPreorder(int[] preorder) {
    
        TreeNode node = new TreeNode(preorder[0]);
        
        for(int i = 1; i < preorder.length; i++)
            insert(node, preorder[i]);
        
        return node;
        
    }
    
    public void insert(TreeNode root,  int value )
    {
    
        if( value == root.val )
        {
            return;
        }
        
        if( value < root.val )
        {
            if( root.left == null )
            {
                root.left = new TreeNode( value );
            }
            else
            {
                insert(root.left, value );
            }
        }
        else
        {
            if( root.right == null )
            {
                root.right = new TreeNode( value );
            }
            else
            {
                insert(root.right, value );
            }
        }
    }
}
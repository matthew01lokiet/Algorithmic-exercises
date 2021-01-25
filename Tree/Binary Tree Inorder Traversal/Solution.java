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
    
    private List<Integer> toRet = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null)
            return toRet;
        
        inorderTrav(root);
        
        return toRet;
        
    }
    
    public void inorderTrav(TreeNode root)
    {
        if( root.left != null )
        {
            inorderTrav(root.left);
        }
        
        toRet.add(root.val);
        
        // right child subtree
        if( root.right != null )
        {
            inorderTrav(root.right);
        }
    
    }
}
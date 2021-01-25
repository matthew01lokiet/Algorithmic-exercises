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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null)
            return toRet;
        
        postorderTrav(root);
        
        return toRet;
        
    }
    
    public void postorderTrav(TreeNode root)
    {
        
        if(root.left != null)
            postorderTrav(root.left);
        
        if(root.right != null)
            postorderTrav(root.right);
        
        if(root != null)
            toRet.add(root.val);
    }
}
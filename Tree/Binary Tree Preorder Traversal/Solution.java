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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
         if(root == null)
            return toRet;
        
        preorderTrav(root);
        
        return toRet;
        
    }
    
    public void preorderTrav(TreeNode root)
    {
        if(root != null)
            toRet.add(root.val);
        
        if(root.left != null)
            preorderTrav(root.left);
        
        if(root.right != null)
            preorderTrav(root.right);
    
    }
}
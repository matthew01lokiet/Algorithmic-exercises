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
    public int maxDepth(TreeNode root) 
    {
        
        if(root == null)
            return 0;
        
        int dep1 = maxDepth(root.left);
        int dep2 = maxDepth(root.right);
        
        int larger =  dep1 > dep2 ? dep1 : dep2;
        
        return larger+1;
        
    }
}
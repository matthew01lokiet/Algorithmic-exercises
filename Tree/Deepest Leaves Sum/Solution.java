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
    
    private int sum = 0;
    private int deepest;
    
    public int deepestLeavesSum(TreeNode root) {
        
        deepest = maxDepth(root);
        
        deepSum(root, 1);
        
        return sum;
    }
    
    public int maxDepth(TreeNode root) 
    {
        
        if(root == null)
            return 0;
        
        int dep1 = maxDepth(root.left);
        int dep2 = maxDepth(root.right);
        
        int larger =  dep1 > dep2 ? dep1 : dep2;
        
        return larger+1;
        
    }
    
    public void deepSum(TreeNode root, int depth)
    {
        if(root.left == null && root.right == null && deepest == depth)
            sum += root.val;
        
        if(root.left != null)
            deepSum(root.left, depth+1);
        
        if(root.right != null)
            deepSum(root.right, depth+1);
    }
}
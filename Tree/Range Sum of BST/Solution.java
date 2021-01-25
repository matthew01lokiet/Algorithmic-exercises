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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        dfs(root, low, high);
        return sum;
        
    }
    
    public void dfs(TreeNode node, int low, int high)
    {
        if(node != null)
        {
            if(node.val <= high && node.val >= low)
                sum += node.val;
            
            if(node.val > low)
                dfs(node.left, low, high);
            
            if(node.val < high)
                dfs(node.right, low, high);
        }
    }
}
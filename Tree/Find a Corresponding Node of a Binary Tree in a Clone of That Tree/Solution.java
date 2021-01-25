/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if(original == target)
            return cloned;
        
        if(original != null)
        {
            TreeNode node1 = getTargetCopy( original.left, cloned.left, target );

            TreeNode node2 = getTargetCopy( original.right, cloned.right, target );
        
            return (node1 != null ? node1 : node2);
        }
        
        return null;
    }
    
    
    
    
}
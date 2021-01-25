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
    
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();   
        
        if(root1 != null)
            traversInOrder(root1, list1);
        
        if(root2 != null)
            traversInOrder(root2, list2);
        
        int minSize = Math.min(list1.size(), list2.size());
        
        int i = 0, j = 0;
        
        List<Integer> retList = new ArrayList<>();
        
        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i) < list2.get(j))
            {
                retList.add(list1.get(i));
                i++;
            }
            else
            {
                retList.add(list2.get(j));
                j++;
            }
        }
        
        if(i < list1.size())
        {
            while(i != list1.size())
            {
                retList.add(list1.get(i));
                i++;
            }
        }
        
        if(j < list2.size())
        {
            while(j != list2.size())
            {
                retList.add(list2.get(j));
                j++;
            }
        }
        
        
        
        return retList;
        
    }
    
    public void traversInOrder(TreeNode root, List<Integer> list)
    {
        
        if( root.left != null )
        {
            traversInOrder(root.left, list);
        }
        
        list.add(root.val);
        
        
        if( root.right != null )
        {
            traversInOrder(root.right, list);
        }
        
    }
}
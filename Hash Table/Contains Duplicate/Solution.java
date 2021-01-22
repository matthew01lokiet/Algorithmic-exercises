class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numsSet = new HashSet<>(); 
            
        for(int i = 0; i < nums.length; i++)
        {
            if(!numsSet.add(nums[i]))
                return true;
        }
        
        return false;
    }
}
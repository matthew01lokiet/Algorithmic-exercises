class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        
        int sumHelper = 0;
        int[] ret = {-1, -1};
        boolean found = false;
        
        for(int i = 0; i < nums.length; i++)
        {
            ret[0] = i;
            sumHelper += nums[i];
            
            for(int j = i + 1; j < nums.length; j++)
            {
                if(sumHelper + nums[j] == target)
                {
                    ret[1] = j;
                    found = true;
                    break;
                }
            }
            
            if(found)
                break;
            else
                sumHelper = 0;
            
        }
        
        return ret;
            
    }
}
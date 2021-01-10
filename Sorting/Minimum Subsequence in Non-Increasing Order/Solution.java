class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        
        int allSum = 0;
        
        for(int numb : nums)
            allSum += numb;
        
        List<Integer> toRet = new ArrayList();
            
        int subSum = 0;
        
        for(int i = nums.length - 1; i >= 0; i--)
        {
            toRet.add(nums[i]);
            
            subSum += nums[i];
            
            if(subSum > (allSum - subSum))
                break;
        }
        
        return toRet;
        
    }
}
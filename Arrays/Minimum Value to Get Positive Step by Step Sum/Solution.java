class Solution {

    public int minStartValue(int[] nums) {
        int startValue = 1;
        int helper = 1;
        boolean isEnd = true;
        
        while(true)
        {
            isEnd = true;
            startValue = helper;
            
            for(int i = 0; i < nums.length; i++)
            {
                startValue += nums[i];
                
                if(startValue < 1 )
                {
                    isEnd = false;
                    break;
                }
            }
            
            if(isEnd)
                return helper;
            else
                helper++;
        }
    }
}

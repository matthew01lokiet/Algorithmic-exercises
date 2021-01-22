class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> countNums = new HashMap<>();
        
        for(int num : nums)
        {
            countNums.put(num, countNums.getOrDefault(num, 0)+1);
        }
        
        final int[] ret = {0};
        
        countNums.forEach((k,v)->{
            
            if(v == 1)
            {
                ret[0] = k;
                return;
            }
            
        });
            
        return ret[0];
        
        
    }
}
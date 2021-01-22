class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map<Integer,Integer> goodPairs = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
            goodPairs.put(nums[i], goodPairs.getOrDefault(nums[i], 0) + 1);
        
        final int[] numsSum = {0};
        
        goodPairs.forEach( (k,v) -> numsSum[0] += ((v*(v-1))/2) ); 
        
        return numsSum[0];
    }
}
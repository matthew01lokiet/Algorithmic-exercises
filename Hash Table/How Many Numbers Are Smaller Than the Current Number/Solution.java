class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] sortArr = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(sortArr);
        
        Map<Integer, Integer> numCount = new HashMap<>();
        
        numCount.put(sortArr[0], 0);
        
        for(int i = 1; i < nums.length; i++)
        {
            if(sortArr[i] > sortArr[i-1])
            {
                numCount.put(sortArr[i], i);
            }
        }
        
        int[] retArr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            retArr[i] = numCount.get(nums[i]);
        }
        
        return retArr;
        
    }
}
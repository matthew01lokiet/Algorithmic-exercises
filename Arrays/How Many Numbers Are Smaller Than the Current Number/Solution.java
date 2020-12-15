class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucketTab = new int[101];
        
        for(int i = 0; i < nums.length; i++)
            bucketTab[nums[i]]++;
        
        int[] bucketContinue = new int[101];
            
        int smallerNumbs = bucketTab[0];
        
        for(int i = 1; i < 101; i++)
        {
            bucketContinue[i] = smallerNumbs;
            smallerNumbs += bucketTab[i];
        }    
        
        int[] answerTab = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            answerTab[i] = bucketContinue[nums[i]];
        }
        
        return answerTab;
    }
}

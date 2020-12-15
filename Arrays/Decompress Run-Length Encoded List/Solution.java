class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] freq = new int[nums.length/2];
        int[] val = new int[nums.length/2];
        
        int freqSum = 0;
        int j = 0;
        
        for(int i = 0; i < nums.length; i += 2)
        {
            freq[j] = nums[i];
            freqSum += freq[j];
            val[j] = nums[i+1];
            j++;
        }
        
        int[] retTab = new int[freqSum];
        
        j = 0;
        
        for(int i = 0; i < freqSum; i++)
        {
            retTab[i] = val[j];
            freq[j]--;
            
            if(freq[j] == 0)
                j++;
        }
        
        return retTab;
    }
}

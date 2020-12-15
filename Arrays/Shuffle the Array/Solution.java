class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] xTab = new int[n];
        int[] yTab = new int[n];
        
        for(int i = 0; i < n; i++)
            xTab[i] = nums[i];
        
        for(int i = n; i < 2*n; i++)
            yTab[i-n] = nums[i];
        
        int[] shuffledTab = new int[2*n];
        
        for(int i = 0; i < 2*n; i += 2)
            shuffledTab[i] = xTab[i/2];
        
        for(int i = 1; i < 2*n; i += 2)
            shuffledTab[i] = yTab[i/2];
        
        return shuffledTab;
    }
}

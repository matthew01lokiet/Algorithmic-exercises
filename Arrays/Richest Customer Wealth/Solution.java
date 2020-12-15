class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int helpSum;
        int biggestWealth = Integer.MIN_VALUE;
        
        
        for(int i = 0; i < accounts.length; i++)
        {
            helpSum = 0;
            
            for(int j = 0; j < accounts[i].length; j++)
            {
                helpSum += accounts[i][j];
            }
            
            if(biggestWealth < helpSum)
                biggestWealth = helpSum;
        }
        
        return biggestWealth;
        
    }
}

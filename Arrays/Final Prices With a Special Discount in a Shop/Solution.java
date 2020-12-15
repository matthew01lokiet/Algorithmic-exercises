class Solution {
    public int[] finalPrices(int[] prices) {
        int[] finPri = new int[prices.length];
        
        int j = 0;
        boolean discount = false;
        
        for(int i = 0; i < prices.length; i++)
        {
            j = i+1;
            
            while(j < prices.length)
            {
                if(prices[j] <= prices[i])
                {
                    finPri[i] = prices[i] - prices[j];
                    discount = true;
                    break;
                }
                else
                    j++;
            }
            
            if(!discount)
                finPri[i] = prices[i];
            else
                discount = false;
        }
        
        return finPri;
    }
}

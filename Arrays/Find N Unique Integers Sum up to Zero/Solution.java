class Solution {
    public int[] sumZero(int n) {
        
        int[] finTab= new int[n];
        
        if(n % 2 == 0)
        {
            int j = 1;
            
            for(int i = n/2; i < n; i++)
            {
                finTab[n/2-j] = j*-1;
                finTab[i] = j;
                j++;
            }
        }
        else
        {
            finTab[n/2] = 0;
            
            int j = 1;
            
            for(int i = n/2+1; i < n; i++)
            {
                finTab[n/2-j] = j*-1;
                finTab[i] = j;
                j++;
            }
        }
        
        return finTab;
    }
}

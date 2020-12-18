class Solution {
    public int smallestRangeI(int[] A, int K) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < A.length; i++)
        {
            if(max < A[i])
                max = A[i];
            
            if(min > A[i])
                min = A[i];
        }
        
        int diff = Math.abs(max-min);
        
        if((max-K) - (min+K) <= 0 )
            return 0;
        else
            return (max-K) - (min+K);
        
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            int j = i;
            
            while(j < arr.length)
            {
                for(int k = i; k <= j; k++)
                    sum += arr[k];
                
                j += 2;
            }
            
            
        }
        
        return sum;
        
    }
}

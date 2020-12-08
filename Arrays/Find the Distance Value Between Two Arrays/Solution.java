class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        
        boolean is = false;
        
        for(int i = 0; i < arr1.length; i++)
        {
            is = true;
            for(int j = 0; j < arr2.length; j++)
            {
                if(abs(arr1[i]-arr2[j]) <= d)
                {
                    is = false;
                    break;
                }
            }
            
            if(is)
                count++;
        }
        
        return count;
    }
    
    
    public int abs(int a)
    {
        return a >= 0 ? a : a*-1;
    }
}

class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int[] ret = new int[2];
        
        for(int i = 1, j = n-1; i < n/2+1; i++, j--)
        {
            if(!(Integer.toString(i).contains("0")) && !(Integer.toString(j).contains("0")) )
            {
                ret[0] = i;
                ret[1] = j;
            }
        }
        
        return ret;
    }
}

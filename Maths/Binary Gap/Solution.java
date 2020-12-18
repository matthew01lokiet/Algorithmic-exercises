class Solution {
    public int binaryGap(int n) {
        
        String binStr = Integer.toBinaryString(n);
        
        int longestDist = 0;
        int currentDist = 0;
        
        for(int i = 0; i < binStr.length(); i++)
        {
            
            if(binStr.charAt(i) == '1')
                for(int j = i+1; j < binStr.length(); j++)
                {
                   if(binStr.charAt(j) == '1')
                   {
                        currentDist = j - i;
                       i = j-1;
                       break;
                   }
                }    
            
            if(currentDist > longestDist)
                longestDist = currentDist;
            
        }
        
        return longestDist;
        
    }
}

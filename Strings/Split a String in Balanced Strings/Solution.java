class Solution {
    public int balancedStringSplit(String s) {
        
        int balancedParts = 0;
        int balancL = 0;
        int balancR = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'L')
                balancL++;
            else 
                balancR++;
            
            if(balancL == balancR)
            {
                balancedParts++;
                balancL = 0;
                balancR = 0;
            }
        }
        
        return balancedParts;
    }
}

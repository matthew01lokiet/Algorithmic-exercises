class Solution {
    public int maxDepth(String s) {
        
        int maxNested = 0;
        int currentNested = 0;
        
        for(char cha : s.toCharArray())
        {
            if(cha == '(')
            {
                currentNested++;
                
                if(maxNested < currentNested)
                    maxNested = currentNested;
            }
            else if(cha == ')')
            {
                currentNested--;
            }
        }
        
        return maxNested;
        
    }
}

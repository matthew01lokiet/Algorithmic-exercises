class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int consistWords = 0;
        
        boolean[] tab = new boolean[123];
        
        for(char cha : allowed.toCharArray())
            tab[(int)(cha)] = true;
        
        boolean isConsist;
        
        for(String word : words)
        {
            isConsist = true;
            
            for(char cha : word.toCharArray())
            {
                if(!tab[(int)(cha)])
                {
                    isConsist = false;
                    break;
                }
            }
            
            if(isConsist)
                consistWords++;
            else
                continue;
        }
        
        return consistWords;
    }
}

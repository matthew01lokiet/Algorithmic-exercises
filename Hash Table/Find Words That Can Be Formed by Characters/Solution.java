class Solution {
    public int countCharacters(String[] words, String chars) {
        
        Map<Character, Integer> countChar = new HashMap<>();
        
        for(char letter : chars.toCharArray())
        {
            countChar.put(letter, countChar.getOrDefault(letter, 0)+1);
        }
                
        int goodSize = 0;

        final boolean[] isGood = {true};
        
        Map<Character, Integer> currentCount;
        
        for(String word : words)
        {
            currentCount = new HashMap<>();
            
            isGood[0] = true;
            
            for(char letter : word.toCharArray())
            {
                currentCount.put(letter, currentCount.getOrDefault(letter, 0)+1);
            }
            
            currentCount.forEach((k,v)->{
                
                if(v > countChar.getOrDefault(k, 0))
                {
                    isGood[0] = false;
                    return;
                }
                
            });
            
            if(isGood[0])
            {
                goodSize += word.length();
                
            }
        }
        
        return goodSize;
        
        
    }
}
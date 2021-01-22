class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> firstRow = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
        Set<Character> secondRow = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
        Set<Character> thirdRow = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m','Z','X','C','V','B','N','M'));
        
        List<String> toRet = new ArrayList<>();
        
        boolean couldBe = true;
        
        for(String word : words)
        {
            for(char letter : word.toCharArray())
            {
                if(!firstRow.contains(letter))
                {
                    couldBe = false;
                    break;
                }
            }
            
            if(couldBe)
            {
                toRet.add(word);
                continue;
            }
            else
                couldBe = true;
            
            ///////////////////////////////////
            
            for(char letter : word.toCharArray())
            {
                
                if(!secondRow.contains(letter))
                {
                    couldBe = false;
                    break;
                }
            }
            
            if(couldBe)
            {
                toRet.add(word);
                continue;
            }
            else
                couldBe = true;
            
            /////////////////////////////////////
            
            for(char letter : word.toCharArray())
            {
                if(!thirdRow.contains(letter))
                {
                    couldBe = false;
                    break;
                }
            }
            
            if(couldBe)
            {
                toRet.add(word);
                continue;
            }
            else
                couldBe = true;
            
            
        }
        
        String[] array = new String[toRet.size()];
        
        return toRet.toArray(array);
        
        
        
        
    }
}
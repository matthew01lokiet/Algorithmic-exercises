class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> toRet = new ArrayList();
        
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words.length; j++)
            {
                if(i != j && words[j].contains(words[i]))
                {
                    toRet.add(words[i]);
                    break;
                }
            }
        }
        
        return toRet;
        
    }
}

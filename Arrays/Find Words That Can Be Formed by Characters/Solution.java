class Solution {
    public int countCharacters(String[] words, String chars) {
        int sumLength = 0;
        boolean help = true;
        
        int[] mainBuckeTab = new int[26];
        
        for(char ch : chars.toCharArray())
        {
            mainBuckeTab[(int)ch - 97]++;
        }
        
        
        
        for(String word : words)
        {
            help = true;
            
            int[] helpBuckeTab = new int[26];
            for(char ch : word.toCharArray())
            {
                helpBuckeTab[(int)ch - 97]++;
            }
            
            for(int i = 0; i < 26; i++)
            {
                if(mainBuckeTab[i] < helpBuckeTab[i])
                {
                    help = false;
                    break;
                }
            }
            
            if(help)
                sumLength += word.length();
        }
        
        return sumLength;
        
    }
}

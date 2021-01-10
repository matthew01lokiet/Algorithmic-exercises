class Solution {
    public String sortString(String s) {
        
        StringBuilder result = new StringBuilder();
        
        int[] countTab = new int[123];
        boolean[] alreadyEmpty = new boolean[123];
        
        for(char letter : s.toCharArray())
            countTab[letter]++;
        
        int areEmpty = 0;
        
        while(areEmpty != 26)
        {
            for(int i = 97; i < 123; i++)
            {    
                if(countTab[i] != 0)
                {
                    result.append((char)i);
                    countTab[i]--;
                }
                else
                {
                    if(!alreadyEmpty[i])
                    {
                        areEmpty++;
                        alreadyEmpty[i] = true;
                    }
                }
            }

            for(int i = 122; i >= 97; i--)
            {
                if(countTab[i] != 0)
                {
                    result.append((char)i);
                    countTab[i]--;
                }
                else
                {
                    if(!alreadyEmpty[i])
                    {
                        areEmpty++;
                        alreadyEmpty[i] = true;
                    }
                }
            }
        }
        
        return result.toString();
        
        
    }
}
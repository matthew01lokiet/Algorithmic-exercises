class Solution {
    public String freqAlphabets(String s) {
        StringBuilder retStr = new StringBuilder();
        
        int codePoint = 0;
        
        java.util.Hashtable<String, Character> tab = new java.util.Hashtable<String, Character>();
        
        Integer inTab = new Integer(0);
        
        for(int i = 10; i < 27; i++)
        {
            inTab = Integer.valueOf(i);
            tab.put(inTab.toString(), (char)(i+96));
        }
        
        //java.util.Set<String> check = tab.keySet();
        
        //for(String key : check)
        //    System.out.println(key + " " + tab.get(key));
        
        for(int i = s.length()-1; i > -1; i--)
        {
            codePoint = s.codePointAt(i);
            
            if( codePoint >= (int)'1' && codePoint <= (int)'9' )
                retStr.insert(0, (char)(codePoint+48));
            else if( codePoint == (int)'#')
            {
                retStr.insert(0, tab.get( s.substring(i-2 ,i)));
                i -= 2;
            }
        }
        
        return retStr.toString();
    }
}

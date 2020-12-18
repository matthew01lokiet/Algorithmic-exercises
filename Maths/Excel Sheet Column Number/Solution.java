import java.util.HashMap;

class Solution {
    public int titleToNumber(String s) {
        HashMap<Character,Integer> diffSyst = new HashMap();
        
        for(int i = 'A'; i <= 'Z'; i++)
        {
            diffSyst.put((char)i, i-64);
        }
        
        int numb = 0;
        
        for(int i = s.length()-1, j = 0; i > -1; i--, j++)
        {
            numb += diffSyst.get(s.charAt(i))*Math.pow(26,j);
        }
        
        return numb;
    }
}

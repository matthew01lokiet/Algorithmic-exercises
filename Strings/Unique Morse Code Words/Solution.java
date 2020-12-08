import java.util.*;


class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        var mapping = new Hashtable<Character, String>();
        
        int start = (int)'a';
        
        String[] keyTable  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",      "-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = start; i < start+26; i++)
            mapping.put((char)i, keyTable[i - (int)'a']);
        
        var arrayStr = new ArrayList<String>();
        
        var strBuild = new StringBuilder();
        
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                strBuild.append(mapping.get(words[i].charAt(j)));
            }
            
            arrayStr.add( strBuild.toString());
            strBuild = strBuild.delete(0, strBuild.length());
        }
        
        int count = 0;
        
        var pattern = new StringBuilder();
        
        while(!arrayStr.isEmpty())
        {
            for(int i = 0; i < arrayStr.size(); i++)
            {
                count++;
                pattern = new StringBuilder(arrayStr.get(i));
                
                while(arrayStr.contains(pattern.toString()))
                {
                    arrayStr.remove(pattern.toString());
                }
                    
            }
        }
        
        return count;
        
    }
}

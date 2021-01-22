class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        
        for(char letter : s.toCharArray())
            countS.put(letter, countS.getOrDefault(letter,0)+1);
        
        for(char letter : t.toCharArray())
            countT.put(letter, countT.getOrDefault(letter,0)+1);
        
        final char[] addedLet = {'a'};
        
        countT.forEach((k,v)->{
            
            if(v == countS.getOrDefault(k,0)+1)
            {
                addedLet[0] = k;
                return;
            }
        });
        
        return addedLet[0];
    }
}
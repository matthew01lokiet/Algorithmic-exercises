class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> lettCount = new HashMap<>();
        
        for(char letter : s.toCharArray())
        {
            lettCount.put(letter, lettCount.getOrDefault(letter,0)+1);
        }
        
        int i = 0;
        
        for(char letter : s.toCharArray())
        {
            if(lettCount.get(letter) == 1)
                return i;
            
            i++;
        }
        
        return -1;
        
    }
}
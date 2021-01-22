class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character, Integer> balonCount = new HashMap<>();
        
        balonCount.put('b', 0);
        balonCount.put('a', 0);
        balonCount.put('l', 0);
        balonCount.put('o', 0);
        balonCount.put('n', 0);
        
        for(char letter : text.toCharArray())
        {
            if(balonCount.containsKey(letter))
            {
                balonCount.put(letter, balonCount.get(letter)+1);
            }
        }
        
        final int[] min = {Integer.MAX_VALUE};
        final int[] temp;
        
        
        balonCount.forEach((k,v) -> {
            
            if(k == 'b' || k == 'a' || k == 'n')
            {
                if(min[0] > v)
                    min[0] = v;
            }
            else
            {
                if(min[0] > v/2)
                    min[0] = v/2;
            }
                
        });
        
        return min[0];
    }
}
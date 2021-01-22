class Solution {
    public int numJewelsInStones(String J, String S) {
        
       Map<Character, Integer> jewels = new HashMap<>();
        
       for(char jewell : J.toCharArray())
       {
           jewels.put(jewell, 0);
       }
        
       for(char stone : S.toCharArray())
       {
           if(jewels.containsKey(stone))
               jewels.put(stone, jewels.get(stone)+1);
       }
        
       final int[] sum = {0};

        jewels.forEach((k,v) -> sum[0] += v);
        
        return sum[0];
    }
}
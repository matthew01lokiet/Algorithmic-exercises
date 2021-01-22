class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> numCount = new HashMap<>();
        
        for(int numb : arr)
            numCount.put(numb, numCount.getOrDefault(numb, 0) + 1);
        
        Set<Integer> distCount = new HashSet<>();
        
        final boolean[] retBool = {true};
        
        numCount.forEach((k,v) ->{
            if(!distCount.add(v))
            {
                retBool[0] = false;
                return;
            }
        });
            
        return retBool[0];
        
    }
}
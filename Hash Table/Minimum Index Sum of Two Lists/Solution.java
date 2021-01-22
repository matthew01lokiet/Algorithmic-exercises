class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> restInd1 = new HashMap<>();
        Map<String, Integer> restInd2 = new HashMap<>();
        
        for(int i = 0; i < list1.length; i++)
        {
            restInd1.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++)
        {
            restInd2.put(list2[i], i);
        }
        
        List<String> list = new ArrayList<>();
        
        final int[] minIndSum = {Integer.MAX_VALUE};
        
        restInd1.forEach((k,v)->{
           
            if(restInd2.containsKey(k))
            {
                int indSum = v + restInd2.get(k);
                
                if( indSum < minIndSum[0])
                {    
                    minIndSum[0] = indSum;
                    list.clear();
                    list.add(k);
                }
                else if(indSum == minIndSum[0])
                {
                    list.add(k);
                }
                
            }
            
        });
        
        return list.toArray(String[]::new);
        
    }
}
class Solution {
    public int repeatedNTimes(int[] A) {
        
        Map<Integer, Integer> numCounts = new HashMap<>();
        
        int retVal = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            
            numCounts.put(A[i], numCounts.getOrDefault(A[i], 0)+1);
            
            if(numCounts.get(A[i]) == A.length/2)
            {    
                retVal = A[i];
                break;
            }
        }
        
        return retVal;
    }
}
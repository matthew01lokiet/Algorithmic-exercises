class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        int helper = 0;
        
        for(int i = 1; i < arr.length; i++)
        {
            helper = abs(arr[i] - arr[i-1]);
            minDiff = helper < minDiff ? helper : minDiff;
        }
        
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        
        for(int i = 1; i < arr.length; i++)
        {
            if(abs(arr[i] - arr[i-1]) == minDiff)
            {
                var fastList = new ArrayList<Integer>();
                fastList.add(arr[i-1]);
                fastList.add(arr[i]);
                
                retList.add(fastList);
            }
        }
        
        return retList;
        
        
    }
    
    public int abs(int a)
    {
        return a >= 0 ? a : a*-1; 
    }
}

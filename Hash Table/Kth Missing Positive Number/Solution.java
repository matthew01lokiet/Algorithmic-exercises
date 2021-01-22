class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        List<Integer> numsList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        Set<Integer> nums = new HashSet<>(numsList);
        
        int missCount = 0;
        
        int toRet = 0;
        
        for(int i = 1; i <= arr[arr.length-1]+k; i++)
        {
            if(!nums.contains(i))
            {
                missCount++;
                
                if(missCount == k)
                {
                    toRet = i;
                    break;
                }
            }
        }
        
        return toRet;
        
    }
}
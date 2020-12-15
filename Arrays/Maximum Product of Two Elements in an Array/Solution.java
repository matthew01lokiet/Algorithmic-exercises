class Solution {
    public int maxProduct(int[] nums) {
        int[] bucketTab = new int[1001];
        
        for(int num : nums)
            bucketTab[num]++;
        
        boolean oneChecked = false;
        int firstValue = 0;
        
        for(int i = 1000; i > -1; i--)
        {
            if(bucketTab[i] > 1 && !oneChecked)
                return (i-1)*(i-1);
            else if(bucketTab[i] >= 1 && oneChecked)
                return firstValue * (i-1);
            else if(bucketTab[i] == 1 && !oneChecked)
            {
                oneChecked = true;
                firstValue = i-1;
            }
        }       
        return firstValue;
    }
}

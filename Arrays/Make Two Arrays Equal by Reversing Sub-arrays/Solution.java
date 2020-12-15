class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] buckeTab1 = new int[1001];
        int[] buckeTab2 = new int[1001];
        
        for(int num : target)
            buckeTab1[num]++;
        
        for(int num : arr)
            buckeTab2[num]++;
        
        for(int i = 0; i < 1001; i++)
            if(buckeTab1[i] != buckeTab2[i])
                return false;
        
        return true;
    }   
}

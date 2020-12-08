class Solution {

    public int findLucky(int[] arr) {
        int[] buckeTab = new int[501];
        
        for(int numb : arr)
            buckeTab[numb]++;
        
        for(int i = 500; i > 0; i--)
            if(buckeTab[i] == i)
                return i;
        
        return -1;
    }
}

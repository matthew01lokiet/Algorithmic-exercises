class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] retArr = new int[arr1.length];
        
        int[] buckeTab = new int[1001];
        
        for(int i = 0; i< arr1.length; i++)
            buckeTab[arr1[i]]++;
        
        int j = 0;
        
        for(int i = 0 ; i < arr2.length; i++)
        {
            while(buckeTab[arr2[i]] != 0)
            {
                retArr[j] = arr2[i];
                buckeTab[arr2[i]]--;
                j++;
            }
        }
        
        for(int i = 0 ; i < 1001; i++)
        {
            while(buckeTab[i] != 0)
            {
                retArr[j] = i;
                buckeTab[i]--;
                j++;
            }
            
            if( j == arr1.length)
                break;
        }
        
        return retArr;
    }
}

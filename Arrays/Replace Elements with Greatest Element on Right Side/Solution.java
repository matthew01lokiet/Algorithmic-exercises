import java.lang.*;

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] finTab = new int[arr.length];
        
        int max = arr[arr.length-1];
        int current = 0;
        
        for(int i = arr.length - 2; i > -1; i--)
        {
            finTab[i] = max;
            max = Math.max(arr[i], max);
            arr[i] = max;
            
        }
        
        finTab[arr.length - 1] = -1;
        
        return finTab;
    }
}

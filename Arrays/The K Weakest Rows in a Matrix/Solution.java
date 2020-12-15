class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        ArrayList<Integer>[] intTab = new ArrayList[mat[0].length+1]; 
        
        for(int i = 0; i < mat[0].length+1; i++)
            intTab[i] = new ArrayList<Integer>();
        
        int j = 0;
        int sum = 0;
        
        for(int i = 0; i < mat.length; i++)
        {
            j = 0;
            sum = 0;
            
            while(j < mat[0].length && mat[i][j] != 0)
            {
                sum++;
                j++;
            }
            
            intTab[sum].add(i);
        }
        
        int[] retTab = new int[k]; 
        
        j = 0;
        
        for(ArrayList<Integer> arr : intTab)
            for(Integer index : arr)
            {
                    retTab[j] = index;
                    j++;
                    k--;
                
                if(k == 0)
                    return retTab;
            }
        
        return retTab;
    }
}

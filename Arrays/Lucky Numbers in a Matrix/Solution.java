class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        var luckyList = new ArrayList<Integer>();
        
        int[] minRows = new int[matrix.length];
        int[] maxColumns = new int[matrix[0].length];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < matrix.length; i++)
        {
            
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(min > matrix[i][j])
                    min = matrix[i][j];
            }        
            
            minRows[i] = min;
            min = Integer.MAX_VALUE;
        }
        
        for(int i = 0; i < matrix[0].length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                if(max < matrix[j][i])
                    max = matrix[j][i];
            }
            
            maxColumns[i] = max;
            max = Integer.MIN_VALUE;
        }
        
        for(int i = 0; i < maxColumns.length; i++)
            for(int j = 0; j < minRows.length; j++)
                if(maxColumns[i] == minRows[j])
                    luckyList.add(maxColumns[i]);
        
        return luckyList;
                
    }
}

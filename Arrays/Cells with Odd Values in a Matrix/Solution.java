class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        
        int[][] matrix = new int[n][m];
        
        for(int i = 0; i < indices.length; i++)
        {
            for(int j = 0; j < m; j++)
                matrix[indices[i][0]][j]++;
            
            for(int j = 0; j < n; j++)
                matrix[j][indices[i][1]]++;
        }
        
        int oddNumb = 0;
        
        for(int[] row : matrix)
            for(int numb : row)
                if(numb % 2 == 1)
                    oddNumb++;
        
        return oddNumb;
    }
}

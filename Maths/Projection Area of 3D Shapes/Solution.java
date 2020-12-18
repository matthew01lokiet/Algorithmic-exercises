class Solution {
    public int projectionArea(int[][] grid) {
        
        int firstProj = 0;
        
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                if(grid[i][j] != 0)
                    firstProj++;
        
        int secondProj = 0;
        
        int max;
        
        for(int i = 0; i < grid.length; i++)
        {
            max = -1;
            
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] > max)
                    max = grid[i][j];
            }
            
            secondProj += max;
        }
        
        int thirdProj = 0;
        
        for(int i = 0; i < grid[0].length; i++)
        {
            max = -1;
            
            for(int j = 0; j < grid.length; j++)
            {
                if(grid[j][i] > max)
                    max = grid[j][i];
                
                
            }
            
                thirdProj += max;
        }
        
        return firstProj+secondProj+thirdProj;
        
    }
}

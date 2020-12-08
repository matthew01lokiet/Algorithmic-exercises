class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int y = matrix.length;
        int x = matrix[0].length;
        
        
        int i = 0;
        
        while(i < y)
        {
            int pom = 0;
            int pom2 = i;
            int pocz = matrix[i][pom];
            
            while(pom2 < y && pom < x)
            {
                if(matrix[pom2][pom] != pocz)
                    return false;
                else
                {
                    pom++;
                    pom2++;
                }
            }
            
            i++;
        }
        
        i = 0;
        
        while(i < x)
        {
            int pom = 0;
            int pom2 = i;
            int pocz = matrix[pom][i];
            
            while(pom2 < x && pom < y)
            {
                if(matrix[pom][pom2] != pocz)
                    return false;
                else
                {
                    pom++;
                    pom2++;
                }
            }
            
            i++;
        }
        
        return true;
        
    }
}

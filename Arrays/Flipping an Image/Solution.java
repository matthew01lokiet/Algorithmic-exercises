class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length/2; j++)
            {
                temp = A[i][j];
                A[i][j] = A[i][A[i].length-j-1];
                A[i][A[i].length-j-1] = temp;
            }
        }
        
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                if(A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }
        
        return A;
    }
}

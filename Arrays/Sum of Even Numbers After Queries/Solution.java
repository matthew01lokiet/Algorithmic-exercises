class Solution {
    
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        
        int sum = 0;
        int[] pairsNumbs = new int[queries.length];
        
        
        for(int numb : A)
            if(numb % 2 == 0)
                sum += numb;
        
        System.out.println(sum);
        
        int helper = 0;
        
        for(int i = 0; i < queries.length; i++)
        {
            if((A[queries[i][1]] + queries[i][0]) % 2 == 0)
            {
                helper = A[queries[i][1]];
                
                if(queries[i][0] % 2 == 0)
                {
                    A[queries[i][1]] += queries[i][0];
                    sum += queries[i][0];
                    pairsNumbs[i] = sum;
                }
                else
                {
                    A[queries[i][1]] += queries[i][0];
                    sum += A[queries[i][1]];
                    pairsNumbs[i] = sum;
                }
                
                
                
                
                System.out.println(sum);
            }
            else if(A[queries[i][1]] % 2 == 0)
            {
                sum -= A[queries[i][1]];
                A[queries[i][1]] += queries[i][0];
                pairsNumbs[i] = sum;
            }
            else
            {
                A[queries[i][1]] += queries[i][0];
                pairsNumbs[i] = sum;
            }
        }
        
        return pairsNumbs;
        
        
    }
}

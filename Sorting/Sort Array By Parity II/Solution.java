class Solution {
    public int[] sortArrayByParityII(int[] A) {
        var oddNums = new ArrayList<Integer>(A.length+1);
        var evenNums = new ArrayList<Integer>(A.length+1);
        
        for(int i = 0; i < A.length; i++)
            if(A[i] % 2 == 0)
                evenNums.add(A[i]);
            else
                oddNums.add(A[i]);
        
        oddNums.trimToSize();
        evenNums.trimToSize();
        
        int j = 0;
        
        for(int i = 0; i < A.length; i += 2)
        {
            A[i] = evenNums.get(j);
            A[i+1] = oddNums.get(j);
            
            j++;
        }
        
        return A;
    }
}

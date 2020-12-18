class Solution {
    public int minOperations(int n) {
        
        int operations = 0;
        
        if(n == 1)
            return 0;
        else if(n % 2 == 1)
        {
            for(int i = 0; i < n/2; i++)
            {
                operations += (n/2-i)*2;
            }
        }
        else
        {
            for(int i = 0; i < n/2; i++)
            {
                operations += (n/2-i-1)*2 + 1;
            }
        }
        
        return operations;
        
    }
}

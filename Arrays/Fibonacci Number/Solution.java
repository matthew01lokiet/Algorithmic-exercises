class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        else if(N == 1)
            return 1;
        else
        {
            int[] tab = new int[N+1];
            tab[0] = 0;
            tab[1] = 1;
        
            for(int i = 2; i < N+1; i++)
                tab[i] = tab[i-1] + tab[i-2];
            
            return tab[N];
        }
        
        
    }
}

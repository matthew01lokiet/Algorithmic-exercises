class Solution {
    public boolean divisorGame(int N) {
        
        int minX;

        int numsOfMovs = 0;

        while(true)
        {
            minX = 2000;

            for(int i = 1; i < N; i++)
            {
                if(N % i == 0)
                    if(minX > i)
                        minX = i;
            }

            if(minX == 2000)
                break;
            else
            {
                N = N - minX;
                numsOfMovs++;
            }
        }

        return (numsOfMovs % 2 == 1);
    }
}

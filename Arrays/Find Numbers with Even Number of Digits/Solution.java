class Solution {
    public int findNumbers(int[] nums) {
        
        int evenNumb = 0;
        
        for(int numb : nums)
        {
            if( even(numb))
                evenNumb++;
        }
        
        return evenNumb;
        
    }
    
    public boolean even(int n)
    {
        int counter = 0;
        
        while(n != 0)
        {
            n /= 10;
            counter++;
        }
        
        return (counter % 2 == 0);
    }
}

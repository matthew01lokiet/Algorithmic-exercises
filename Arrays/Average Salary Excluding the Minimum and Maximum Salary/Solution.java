class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        
        for(int numb : salary)
        {
            if(numb > max)
                max = numb;
            if(numb < min)
                min = numb;
            
            sum += numb;
        }
        
        return (sum-max-min)/(double)(salary.length-2);
    }
}

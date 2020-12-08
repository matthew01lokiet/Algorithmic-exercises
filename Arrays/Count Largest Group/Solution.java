class Solution {
    public int countLargestGroup(int n) {
        
        int[] buckeTab = new int[37];
        
        for(int i = 1; i <= n; i++)
        {
            buckeTab[ Solution.digitSum(i) ]++;
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 1; i < 37; i++)
            max = max >= buckeTab[i] ? max : buckeTab[i];
        
        int retNum = 0;
        
        for(int i = 1; i < 37; i++)
            if(buckeTab[i] == max)
                retNum++;
        
        return retNum;
        
    }
    
    public static int digitSum(int a)
    {
        int sum = 0;
        
        while(a != 0)
        {
            sum += a%10;
            a /= 10;
        }
        
        
        return sum;
    }
}

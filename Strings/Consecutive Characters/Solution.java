class Solution {
    public int maxPower(String s) {
        
        int maxSubPower = 1;
        int currSubPower = 1;
        
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                currSubPower++;
                
                if(currSubPower > maxSubPower)
                    maxSubPower = currSubPower;
            }
            else
                currSubPower = 1;
        }
        
        return maxSubPower;
        
    }
}

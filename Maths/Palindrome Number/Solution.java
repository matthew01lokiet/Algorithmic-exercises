class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x < 0)
            return false;
        else
        {
            String palin = String.valueOf(x);
            
            int len = palin.length();
            
            for(int i = 0; i < len/2; i++)
            {
            
                if((int)palin.charAt(i) != (int)palin.charAt(len - 1 - i))
                {  
                    return false;
                }
                
            }
                
            return true;
        }
    }
}

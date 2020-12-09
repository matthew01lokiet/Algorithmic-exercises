class Solution 
{
    public int reverse(int x) 
    {
        
        if(x == Integer.MIN_VALUE)
            return 0;
        else
        {
            if(x > 0)
            {
                StringBuilder palin = new StringBuilder(String.valueOf(x));
                
                String palinStr = palin.reverse().toString();
                
                if(Long.parseLong(palinStr) < Integer.MIN_VALUE ||
                    Long.parseLong(palinStr) > Integer.MAX_VALUE)
                        return 0;
                else
                    return Integer.parseInt(palinStr);
            }
            else if(x < 0)
            {
                x *= -1;
                StringBuilder palin = new StringBuilder(String.valueOf(x));
                String palinStr = palin.reverse().toString();
                
                if(Long.parseLong(palinStr) * -1 < Integer.MIN_VALUE ||
                    Long.parseLong(palinStr) * -1 > Integer.MAX_VALUE)
                        return 0;
                else
                    palinStr = "-" + palinStr;
                    return Integer.parseInt(palinStr);
                
            }else
                return 0;
        }
    
    }
}

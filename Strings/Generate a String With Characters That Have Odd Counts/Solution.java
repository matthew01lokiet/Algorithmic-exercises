class Solution {
    public String generateTheString(int n) {
        
        StringBuilder toRet = new StringBuilder();
        
        if(n % 2 == 1)
        {
            for(int i = 0; i < n; i++)
                toRet.append("a");
        }
        else
        {
            for(int i = 0; i < n-1; i++)
                toRet.append("a");
            
            toRet.append("b");
        }
        
        
        return toRet.toString();
    }
}

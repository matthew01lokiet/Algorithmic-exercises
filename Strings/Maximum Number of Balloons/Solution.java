class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int b=0,a=0,l=0,o=0,n=0;
        
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == 'b')
                b++;
            else if(text.charAt(i) == 'a')
                a++;
            else if(text.charAt(i) == 'l')
                l++;
            else if(text.charAt(i) == 'o')
                o++;
            else if(text.charAt(i) == 'n')
                n++;
        }
        
        int balloons = 0;
        
        while(true)
        {
            b--;
            if(b < 0)
                break;
            
            a--;
            if(a < 0)
                break;
            
            l -= 2;
            if(l < 0)
                break;
            
            o -= 2;
            if(o < 0)
                break;
            
            n--;
            if(n < 0)
                break;
            
            balloons++;
        }       
        
        
        return balloons;
    }
}

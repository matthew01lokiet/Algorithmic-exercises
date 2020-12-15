class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] dec = new int[code.length];
        
        if(k == 0)
        {
            return dec;
        }
        else if(k > 0)
        {
            int helpCountLen, helpCountIncr;
            
            for(int i = 0; i < code.length; i++)
            {
                helpCountLen = 0;
                helpCountIncr = i;
                
                while(true)
                {
                    if((helpCountIncr + 1) == code.length)
                    {    
                        helpCountIncr = 0;
                        helpCountLen++;
                    }
                    else
                    {
                        helpCountIncr++;
                        helpCountLen++;
                    }
                    
                    dec[i] += code[helpCountIncr];
                    
                    if(helpCountLen == k)
                        break;    
                }
                 
            }
            
        }
        else if(k < 0)
        {
            int helpCountLen, helpCountIncr;
            
            for(int i = 0; i < code.length; i++)
            {
                helpCountLen = 0;
                helpCountIncr = i;
                
                while(true)
                {
                    if((helpCountIncr - 1) < 0)
                    {    
                        helpCountIncr = code.length-1;
                        helpCountLen--;
                    }
                    else
                    {
                        helpCountIncr--;
                        helpCountLen--;
                    }
                    
                    dec[i] += code[helpCountIncr];
                    
                    if(helpCountLen == k)
                        break;    
                }
                 
            }
            
        }
        
        return dec;
        
    }
}

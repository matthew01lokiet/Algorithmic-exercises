class Solution {
    public String removeOuterParentheses(String S) {
       
        Deque<Character> parenth = new LinkedList();
        
        int levels = 0;
        
        for(Character par : S.toCharArray())
        {
            if(levels > 0)
            {
                if(par == '(')
                    levels++;
                else
                    levels--;
                
                if(levels == 0)
                    continue;
                
                parenth.push(par);
            }
            else
            {
                if(par == '(')
                    levels++;
                else
                    levels--;
                
                continue;
            }
        }
        
        StringBuilder toRet = new StringBuilder();
        
        while(!parenth.isEmpty())
        {
            toRet.insert(0, parenth.pop());
        }
        
        return toRet.toString();
        
    }
}
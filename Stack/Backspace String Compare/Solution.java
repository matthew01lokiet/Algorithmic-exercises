class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Deque<Character> stackS = new LinkedList();
        Deque<Character> stackT = new LinkedList();
        
        for(Character letter : S.toCharArray())
        {
            if(letter == '#')
            {
                if(stackS.isEmpty())
                    continue;
                else
                    stackS.pop();
            }
            else
                stackS.push(letter);
        }
        
        for(Character letter : T.toCharArray())
        {
            if(letter == '#')
            {
                if(stackT.isEmpty())
                    continue;
                else
                    stackT.pop();
            }
            else
                stackT.push(letter);
        }
        
        if(stackS.size() != stackT.size())
            return false;
        
        int siz = stackS.size();
        
        for(int i = 0; i < siz; i++)
        {
            if(stackS.pop() != stackT.pop())
                return false;
        }
        
        return true;
        
    }
}
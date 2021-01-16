class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new LinkedList();
        
        for(Character par : s.toCharArray())
        {
            if(par == '{' || par == '[' || par == '(')
            {
                stack.push(par);
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                
                if(par == '}' && stack.peek() == '{')
                    stack.pop();
                else if(par == ']' && stack.peek() == '[')
                    stack.pop();
                else if(par == ')' && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
        }
        
        if(stack.size() == 0)
            return true;
        else
            return false;
        
    }
}
class Solution {
    public String removeDuplicates(String S) {
        
        Deque<Character> stack = new LinkedList<>();
        
        for(Character letter : S.toCharArray())
        {
            if(stack.peek() != letter)
            {
                stack.push(letter);
            }
            else
            {
                stack.pop();
            }
        }
        
        StringBuilder toRet = new StringBuilder();
        
        while(!stack.isEmpty())
        {
            toRet.insert(0, stack.pop());
        }
        
        return toRet.toString();
        
    }
}
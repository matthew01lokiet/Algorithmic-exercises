class Solution {
    public int minAddToMakeValid(String S) {
        
        Deque<Character> par = new LinkedList();
        
        
        
        for(Character letter : S.toCharArray())
        {
            if(par.isEmpty())
                par.push(letter);
            else if(par.peek() == '(' && letter == ')')
                par.pop();
            else
                par.push(letter);
        }
        
        return par.size();
    }
}
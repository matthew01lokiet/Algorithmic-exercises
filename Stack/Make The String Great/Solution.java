class Solution {
    public String makeGood(String s) {
        
        Deque<Character> goodString = new LinkedList<>();
        
        int diff = 'a' - 'A';
        
        int currentNumbAscii = 10000;
        
        for(Character letter : s.toCharArray())
        {
            if(!goodString.isEmpty())
                currentNumbAscii = (int)goodString.peek();
            
            if( goodString.isEmpty() || Math.abs(currentNumbAscii - letter) != diff )
                goodString.push(letter);
            else if(!goodString.isEmpty())
                goodString.pop();
        }
        
        StringBuilder toRet = new StringBuilder();
        
        while(!goodString.isEmpty())
        {
            toRet.insert(0, goodString.pop());
        }
        
        return toRet.toString();
        
    }
}
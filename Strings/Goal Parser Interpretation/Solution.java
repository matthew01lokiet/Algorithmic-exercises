class Solution {
    public String interpret(String command) {
        
        StringBuilder parsedStr = new StringBuilder();
        
        for(int i = 0; i < command.length(); i++)
        {
            if(command.charAt(i) == 'G')
                parsedStr.append("G");
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {
                parsedStr.append("o");
                i++;
            }
            else
            {
                parsedStr.append("al");
                i += 3;
            }
        }
        
        return parsedStr.toString();
        
    }
}

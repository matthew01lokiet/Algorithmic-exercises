class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        StringBuilder toRet = new StringBuilder();
        
        for(String word : words)
        {
            toRet.append(new StringBuilder(word).reverse().toString());
            toRet.append(" ");
        }
        
        toRet.deleteCharAt(toRet.length() - 1);
        
        return toRet.toString();
            
        
    }
}

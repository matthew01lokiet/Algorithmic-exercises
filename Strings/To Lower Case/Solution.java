class Solution {
    public String toLowerCase(String str) {
        
        StringBuilder toLowerStr = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++)
        {
            if( str.codePointAt(i) >= 65 && str.codePointAt(i) <= 90)
            {
                toLowerStr.append( (char)(str.codePointAt(i) + 32));
            }
            else
            {
                toLowerStr.append( (char)(str.codePointAt(i)));
            }
        }
        
        return toLowerStr.toString();
    }
}

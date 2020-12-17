class Solution {
    public void reverseString(char[] s) {
        
        char a;
        
        for(int i = 0, j = s.length-1; i < (s.length/2); i++,j--)
        {
            a = s[i];
            s[i] = s[j];
            s[j] = a;
        }
        
    }
}

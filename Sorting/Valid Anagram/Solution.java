class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] tabS = new int[123];
        int[] tabT = new int[123];
        
        for(char ch : s.toCharArray())
            tabS[ch]++;
        
        for(char ch : t.toCharArray())
            tabT[ch]++;
        
        for(int i = 97; i < 123; i++)
            if(tabS[i] != tabT[i])
                return false;
        
        return true;
        
    }
}
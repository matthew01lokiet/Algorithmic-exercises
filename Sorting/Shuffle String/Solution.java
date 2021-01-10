class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuilder toRet = new StringBuilder();
        toRet.setLength(indices.length);
        
        for(int i = 0; i < indices.length; i++)
        {
            toRet.replace(indices[i] , indices[i] + 1, s.substring(i, i+1));
        }
        
        return toRet.toString();
        
    }
    
    
}
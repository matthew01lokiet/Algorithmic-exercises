class Solution {
    public String defangIPaddr(String address) {
        StringBuilder IP = new StringBuilder(address);
        
        for(int i = 0;i < IP.length(); i++)
        {
            if( IP.charAt(i) == '.')
            {
                IP.insert(i, "[");
                IP.insert(i+2, "]");
                i += 1;
            }
        }
        
        return IP.toString();
    }
}

class Solution {
    public int maximum69Number (int num) {
        Integer numInt = new Integer(num);
        
        StringBuilder strInt = new StringBuilder(numInt.toString());
        
        for(int i = 0; i < strInt.length(); i++)
        {
            if(strInt.charAt(i) == '6')
            {
                strInt.replace(i, i+1, "9");
                break;
            }
        }
        
        return Integer.parseInt(strInt.toString());
    }
}

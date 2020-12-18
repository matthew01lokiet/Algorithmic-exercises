class Solution {
    public int bitwiseComplement(int N) {
        
        String binN = Integer.toBinaryString(N);
        StringBuilder toParse = new StringBuilder();
        
        for(int i = 0; i < binN.length(); i++)
        {
            if(binN.charAt(i) == '0')
                toParse.append("1");
            else
                toParse.append("0");
        }
        
        
        return Integer.parseInt(toParse.toString(),2);
    }
}

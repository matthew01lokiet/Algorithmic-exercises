class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0)
            return false;
        
        String bin = Integer.toBinaryString(n);
        
        int numbOfOne = 0;
        
        for( char num : bin.toCharArray())
            if(num == '1')
                numbOfOne++;
        
        if(numbOfOne == 1)
            return true;
        else
            return false;
    }
}

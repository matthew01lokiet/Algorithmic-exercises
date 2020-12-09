class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;
        return (1_162_261_467 % n == 0);
    }
}

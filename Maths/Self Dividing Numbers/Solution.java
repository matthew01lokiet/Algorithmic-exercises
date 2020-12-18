class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> numbs = new ArrayList();
        
        int numb, part;
        boolean canDivide;
        
        for(int i = left; i < right+1; i++)
        {
            numb = i;
            canDivide = true;
            
            while(numb != 0)
            {
                part = numb % 10;
                numb /= 10;
                
                if(part == 0 || i % part != 0)
                {
                    canDivide = false;
                    break;
                }
            }
            
            if(canDivide)
                numbs.add(i);
            
        }
        
        return numbs;
        
    }
}

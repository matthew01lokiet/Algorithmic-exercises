class Solution {
    public int minCostToMoveChips(int[] chips) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int pos : chips)
        {
            min = min > pos ? pos : min;
            max = max < pos ? pos : max;
        }
        
        int middle1 = (min+max)/2;
        int middle2 = middle1+1;
        
        int movs1 = 0;
        int movs2 = 0;
        
        for(int pos : chips)
        {
            if(pos % 2 != middle1 % 2)
                movs1++;
            
            if(pos % 2 != middle2 % 2)
                movs2++;
        }
        
        return movs1 >= movs2 ? movs2 : movs1; 
        
    }
}

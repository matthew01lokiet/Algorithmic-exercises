class Solution {
    public int heightChecker(int[] heights) {
        int changes = 0;
        
        int[] buckeTab = new int[101];
        
        for(int height : heights)
            buckeTab[height]++;
        
        int j = 0;
        
        for(int i = 0; i < 101; i++)
        {
            while(buckeTab[i] > 0)
            {
                if(heights[j] != i)
                {
                    changes += 1;
                    heights[j] = i;
                    buckeTab[i]--;
                    j++;
                }
                else
                {
                    buckeTab[i]--;
                    j++;
                }
            }
        }
        
        return changes;
    }
}

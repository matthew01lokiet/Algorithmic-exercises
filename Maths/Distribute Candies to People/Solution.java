class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int[] distrCand = new int[num_people];
        
        int iteration = 0;
        
        while(true)
        {
            for(int i = 0; i < num_people; i++)
            {
                candies -= (i+1+iteration);
                distrCand[i] += (i+1+iteration);
                
                if(candies < 0)
                {
                    distrCand[i] += candies;
                    break;
                }
            }
            
            if(candies <= 0)
                break;
            
            iteration += num_people;
                
        }
        
        return distrCand;
    }
}

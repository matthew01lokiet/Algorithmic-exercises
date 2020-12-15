class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        
        for(int num : candies)
            if(max < num)
                max = num;
        
        var retList = new ArrayList<Boolean>();
        
        for(int num : candies)
            if(num + extraCandies >= max)
                retList.add(true);
            else
                retList.add(false);
        
        return retList;
    }   
}

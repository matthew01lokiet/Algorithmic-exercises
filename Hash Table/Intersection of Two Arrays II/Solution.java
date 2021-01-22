class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> numsCount = new HashMap<>();
        
        for(int numb : nums1)
            numsCount.put(numb, numsCount.getOrDefault(numb, 0)+1 );
        
        List<Integer> interNums = new ArrayList<>();
        
        for(int numb : nums2)
        {
            if(numsCount.getOrDefault(numb, 0) != 0)
            {
                numsCount.put(numb, numsCount.get(numb)-1);
                interNums.add(numb);
            }
        }
        
        return interNums.stream().mapToInt(i->i).toArray();
        
        
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> occuredNums = new HashSet<>();
        
        for(int num : nums1)
            occuredNums.add(num);
        
        List<Integer> interNums = new ArrayList<>();
        
        for(int num : nums2)
            if(occuredNums.contains(num) && !interNums.contains(num))
                interNums.add(num);
        
        return interNums.stream().mapToInt(i -> i).toArray();
        
    }
}
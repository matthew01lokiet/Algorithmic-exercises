class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> values = new ArrayList(nums.length);
        
        for(int i = 0; i < nums.length; i++)
            values.add(index[i], nums[i]);
        
        int[] retTab = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
            retTab[i] = values.get(i).intValue();
        
        return retTab;
    }
}

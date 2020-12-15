class Solution {
    public int[] sortArrayByParity(int[] A) {
        var intDeque = new ArrayDeque<Integer>();
        
        for(int numb : A)
        {
            if(numb % 2 == 0)
                intDeque.addFirst(numb);
            else
                intDeque.addLast(numb);
        }
        
        Integer[] tab = intDeque.toArray(new Integer[intDeque.size()]);
        
        return intDeque.stream().mapToInt(Integer::intValue).toArray();
    }
}

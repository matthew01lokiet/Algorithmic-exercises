class Solution {
    public int[] sortByBits(int[] arr) {
        
        Arrays.sort(arr);
        
        int sortedIndex = arr.length-1;
        int largestIndex;
        int largestNumbBits;
        int largestNumb;
        
        while(sortedIndex != 0)
        {
            
            largestNumb = -1;
            largestNumbBits = -1;
            largestIndex = sortedIndex;
            
            for(int i = 0; i <= sortedIndex; i++)
            {
                if(numOfOneBits(arr[i]) > largestNumbBits || (arr[i] > largestNumb && numOfOneBits(arr[i]) == largestNumbBits))
                {
                        largestNumbBits = numOfOneBits(arr[i]);
                        largestNumb = arr[i];
                        largestIndex = i;
                }
            }
            
            int temp = arr[sortedIndex];
            
            arr[sortedIndex] = arr[largestIndex];
            
            arr[largestIndex] = temp;
            
            sortedIndex--;
        }
        
        return arr;
        
    }
    
    public static int numOfOneBits(int a)
    {
        String binString = Integer.toBinaryString(a);
        
        int ones = 0;
        
        for(char bit : binString.toCharArray())
        {
            if(bit == '1')
                ones++;
        }
            
        return ones;
    }
}
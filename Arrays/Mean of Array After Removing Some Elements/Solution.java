class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        
        int smallest = (int)(arr.length * 0.05);
        int largest = smallest;
        
        int sumOfRemainings = 0;
        
        for(int i = smallest; i < (arr.length-largest); i++)
        {
            sumOfRemainings += arr[i];
        }
        
        int remainingLen = arr.length - (smallest*2);
        
        return (double)(sumOfRemainings/(double)(remainingLen));
    }
}

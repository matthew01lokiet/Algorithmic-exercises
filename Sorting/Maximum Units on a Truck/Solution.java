class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int[] countTab = new int[1001];
        
        for(int i = 0; i < boxTypes.length; i++)
        {
            countTab[boxTypes[i][1]] += boxTypes[i][0];
        }
        
        int units = 0;
        int boxNumbers = 0;
        
        for(int i = 1000; i > 0; i--)
        {
            while(countTab[i] != 0 && truckSize != boxNumbers)
            {
                units += i;
                boxNumbers++;
                
                countTab[i]--;
            }
            
            if(truckSize == boxNumbers)
                break;
        }
        
        return units;
        
    }
}
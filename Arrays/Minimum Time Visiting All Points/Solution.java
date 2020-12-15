class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int seconds = 0;
        int[] currentPoint = new int[2];
        
        currentPoint[0] = points[0][0];
        currentPoint[1] = points[0][1];
        
        int i = 1;
        
        while(!(currentPoint[0] == points[points.length - 1][0] &&
                currentPoint[1] == points[points.length - 1][1]))
        {
            if(currentPoint[0] < points[i][0] && currentPoint[1] < points[i][1])
            {
                currentPoint[0]++; currentPoint[1]++;
            }
            else if(currentPoint[0] > points[i][0] && currentPoint[1] > points[i][1])
            {
                currentPoint[0]--; currentPoint[1]--;
            }
            else if(currentPoint[0] < points[i][0] && currentPoint[1] > points[i][1])
            {
                currentPoint[0]++; currentPoint[1]--;
            }
            else if(currentPoint[0] > points[i][0] && currentPoint[1] < points[i][1])
            {
                currentPoint[0]--; currentPoint[1]++;
            }
            else if(currentPoint[0] > points[i][0])
                currentPoint[0]--;
            else if(currentPoint[0] < points[i][0])
                currentPoint[0]++;
            else if(currentPoint[1] < points[i][1])
                currentPoint[1]++;
            else if(currentPoint[1] > points[i][1])
                currentPoint[1]--;
            else 
            {
                i++;
            }
            
            seconds++;
        }
        
        int adjust = points.length - 2;
        
        return seconds-adjust;
    }
}

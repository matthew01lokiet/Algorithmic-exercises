class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> stackOperations = new ArrayList();
        
        int j = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(target[j] == i)
            {
                stackOperations.add("Push");
                j++;
            }
            else
            {
                
                    stackOperations.add("Push");
                    stackOperations.add("Pop");
                
            }
            
            if(j == target.length)
                break;
        }
        
        return stackOperations;
        
    }
}
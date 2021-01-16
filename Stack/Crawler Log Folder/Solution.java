class Solution {
    public int minOperations(String[] logs) {
        
        Deque<Integer> levels = new LinkedList<>();
        
        for(String log : logs)
        {
            if(log.equals("../") && !levels.isEmpty())
                levels.pop();
            else if(log.equals("./") || (log.equals("../") && levels.isEmpty()))
                continue;
            else
                levels.push(1);
        }
        
        return levels.size();
    }
}
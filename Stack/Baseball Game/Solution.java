class Solution {
    public int calPoints(String[] ops) {
        
        int scoreSum = 0;
        
        Deque<Integer> scores = new LinkedList<>();
        
        for(String op : ops)
        {
            if(op.equals("C"))
                scores.pop();
            else if(op.equals("D"))
                scores.push(scores.peek() * 2);
            else if(op.equals("+"))
            {
                int first = scores.pop();
                int second = scores.peek();
                
                scores.push(first);
                scores.push(first+second);
            }
            else
                scores.push(Integer.parseInt(op));
        }
        
        while(!scores.isEmpty())
        {
            scoreSum += scores.pop();
        }
        
        return scoreSum;
        
    }
}
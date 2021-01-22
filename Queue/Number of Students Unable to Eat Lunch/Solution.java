class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> studentsQue = new LinkedList<>();
        Deque<Integer> sandwichStack = new LinkedList<>();
        
        for(int i = 0; i < students.length; i++)
            studentsQue.add(students[i]);
        
        for(int i = sandwiches.length - 1; i > -1; i--)
            sandwichStack.push(sandwiches[i]);
        
        int currentStund = 0;
        
        while(!sandwichStack.isEmpty())
        {
            
            if(studentsQue.peek() == sandwichStack.peek())
            {
                studentsQue.remove();
                sandwichStack.pop();
                
                currentStund = 0;
            }
            else
            {
                currentStund++;
                
                if(currentStund == studentsQue.size())
                    return studentsQue.size();
                else
                {
                    studentsQue.add(studentsQue.remove());
                }
            }
        }
        
        return 0;
        
    }
}
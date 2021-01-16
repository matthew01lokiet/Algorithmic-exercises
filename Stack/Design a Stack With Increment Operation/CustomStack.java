class CustomStack {

    private Deque<Integer> stack;
    private int maxSize;
    
    public CustomStack(int maxSize) {
        
        stack = new LinkedList<>();
        this.maxSize = maxSize;
        
    }
    
    public void push(int x) {
        
        if(stack.size() < maxSize)
        {
            stack.push(x);
        }
        
    }
    
    public int pop() {
        
        if(stack.isEmpty())
            return -1;
        else
            return stack.pop();
        
    }
    
    public void increment(int k, int val) {
        
        if(k >= stack.size())
        {
            int siz = stack.size();
            
            Deque<Integer> incrInts = new LinkedList();
            
            for(int i = 0; i < siz; i++)
            {
                incrInts.push(stack.pop()+val);
            }
            
            for(int i = 0; i < siz; i++)
            {
                stack.push(incrInts.pop());
            }
        }
        else
        {
            Deque<Integer> incrInts = new LinkedList<>();
            
            int siz = stack.size();
            
            for(int i = 0; i < siz-k; i++)
            {
                incrInts.push(stack.pop());
            }
            
            for(int i = 0; i < k; i++)
            {
                incrInts.push(stack.pop()+val);
            }
            
            int siz2 = incrInts.size();
            
            for(int i = 0; i < siz2; i++)
            {
                stack.push(incrInts.pop());
            }
            
            
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
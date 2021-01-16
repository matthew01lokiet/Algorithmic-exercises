class MyQueue {

    Deque<Integer> stack;
    Deque<Integer> reversedStack;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        
        stack = new LinkedList<>();
        reversedStack = new LinkedList<>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        stack.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        int siz = stack.size();
        
        for(int i = 0; i < siz; i++)
        {
            reversedStack.push(stack.pop());
        }
        
        int ret = reversedStack.pop();
        
        for(int i = 0; i < siz-1; i++)
        {
            stack.push(reversedStack.pop());
        }
        
        return ret;
        
        
    }
    
    /** Get the front element. */
    public int peek() {
        
        int siz = stack.size();
        
        for(int i = 0; i < siz; i++)
        {
            reversedStack.push(stack.pop());
        }
        
        int ret = reversedStack.peek();
        
        for(int i = 0; i < siz; i++)
        {
            stack.push(reversedStack.pop());
        }
        
        return ret;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
        return stack.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
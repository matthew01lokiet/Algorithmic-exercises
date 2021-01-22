class MyCircularQueue {

    private int[] numbs;
    private int start;
    private int end;
    private int size;
    
    // done
    public MyCircularQueue(int k) {
        
        numbs = new int[k];
        
        start = -1;
        end = -1;
        
        size = 0;
        
    }
    
    
    
    
    public boolean enQueue(int value) {
        
        if(size == numbs.length)
            return false;
        else
        {
            if(start == -1)
            {
                start = 0;
                numbs[start] = value;
                end = start;
                
                size++;
            }
            else
            {
                end = (end+1) % numbs.length;
                numbs[end] = value;
                
                size++;
            }
            
            return true;
        }
        
    }
    
    public boolean deQueue() {
        
        if(size == 0)
            return false;
        else
        {
            start = (start + 1) % numbs.length;
            size--;
            
            return true;
        }
        
        
    }
    
    
    
    
    
    // done
    public int Front() {
        
        if(size == 0)
            return -1;
        else
            return numbs[start];
        
    }
    
    // done
    public int Rear() {
        
        if(size == 0)
            return -1;
        else
            return numbs[end];
        
    }
    
    // done
    public boolean isEmpty() {
        
        return size == 0 ? true : false;
        
    }
    
    //done
    public boolean isFull() {
        
        return size == numbs.length ? true : false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
class RecentCounter {

    Queue<Integer> requests;
    
    public RecentCounter() {
        
        requests = new LinkedList<>();
        
    }
    
    public int ping(int t) {
        
        if(requests.isEmpty())
        {
            requests.add(t);
            return 1;
        }
        else
        {
            while(!requests.isEmpty() && requests.peek() < t-3000)
            {
                requests.remove();
            }
            
            requests.add(t);
            return requests.size();
        }
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
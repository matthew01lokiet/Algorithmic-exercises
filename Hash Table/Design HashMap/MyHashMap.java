class MyHashMap {
    
    private int[] hashMap;
    private boolean[] init;

    /** Initialize your data structure here. */
    public MyHashMap() {
        
        hashMap = new int[1000001];
        init = new boolean[1000001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        
        
        hashMap[key] = value;
        
        init[key] = true;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        
        if(init[key])
            return hashMap[key];
        else
            return -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        
        init[key] = false;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
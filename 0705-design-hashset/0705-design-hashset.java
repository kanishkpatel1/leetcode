class MyHashSet {
    
    boolean arr[];
    public MyHashSet() {
        arr=new boolean[1000000+1];  // as per the que we can have as many 10^6 keys so use 10^6+1 index boolean array
    }
    
    public void add(int key) {
        arr[key]=true;  // put true at index that means key present
    }
    
    public void remove(int key) {
        arr[key]=false;       // put false at index that means key is not present
    }
    
    public boolean contains(int key) {
        return arr[key];  // if key present return true else return false
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
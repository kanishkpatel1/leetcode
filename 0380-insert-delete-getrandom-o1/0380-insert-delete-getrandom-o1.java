class RandomizedSet {
    // to get random variable we use list each time we generate a random index from rand function 
    // and then return the item from the list and to remove element we remove the last element from the list so to keep the track we use map and list to achieve O(1) time complexity
    // map stores value and its corresponding index
    // list because it provides O(1) for add , remove and get random element
    private ArrayList<Integer> ls=new ArrayList<>();
    private Map<Integer, Integer> map=new HashMap<>();
    private Random rand = new Random(); 
    
    public boolean insert(int val) {
        if(map.containsKey(val)){ // cant add duplicate element in set
            return false;
        }
        map.put(val,ls.size()); //ls.size()= index in list 
        ls.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index=map.get(val); // get index of the item from the map
        int lastele=ls.get(ls.size()-1);
        ls.set(index,lastele); // set the last element to that particular position
        map.put(lastele,index); // put the element and index in the map
        ls.remove(ls.size()-1); // remove the last element from the list 
        map.remove(val); // remove the key from map
        return true;
    }
    
    public int getRandom() {
       
        int randomIndex=rand.nextInt(ls.size()) ; // O(1)
        return ls.get(randomIndex);   // O(1) 
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
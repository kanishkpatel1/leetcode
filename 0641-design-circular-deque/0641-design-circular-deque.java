// Using arrayList

class MyCircularDeque {
    ArrayList<Integer> ls=new ArrayList<>();
    int size;
    public MyCircularDeque(int k) {
        this.size=k;
    }
    
    public boolean insertFront(int value) {
        if(ls.size()<=size-1){
            ls.add(0,value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(ls.size()<=size-1){
            ls.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(ls.size()==0){
            return false;
        }
        ls.remove(0);
        return true;
    }
    
    public boolean deleteLast() {
         if(ls.size()==0){
            return false;
        }
        ls.remove(ls.size()-1);
        return true;
    }
    
    public int getFront() {
        if(ls.size()==0){
            return -1;
        }
        return ls.get(0);
    }
    
    public int getRear() {
         if(ls.size()==0){
            return -1;
        }
        return ls.get(ls.size()-1);
    }
    
    public boolean isEmpty() {
        return (ls.size()==0);
    }
    
    public boolean isFull() {
        return (ls.size()==size);
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
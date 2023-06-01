class FrontMiddleBackQueue {
  
   ArrayList<Integer> ls=new ArrayList<>(); 
    public FrontMiddleBackQueue() {
        
    }
    
    public void pushFront(int val) {
        ls.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int midd=ls.size()/2;
        ls.add(midd,val);
    }
    
    public void pushBack(int val) {
        ls.add(val);
    }
    
    public int popFront() {
        if(ls.size()==0){
            return -1;
        }
        return ls.remove(0);
    }
    
    public int popMiddle() {
          if(ls.size()==0){
            return -1;
        }
         int index=0;
        if(ls.size()%2==0)
            index=ls.size()/2-1;
        else
            index=ls.size()/2;
        return ls.remove(index);
    }
    
    public int popBack() {
         if(ls.size()==0){
            return -1;
        }
        return ls.remove(ls.size()-1);
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
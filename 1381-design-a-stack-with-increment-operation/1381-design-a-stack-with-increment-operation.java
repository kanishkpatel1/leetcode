class CustomStack {
    int arr[];
    int size;
    int ptr=0;
    public CustomStack(int maxSize) {
        this.arr=new int[maxSize];
        this.size=maxSize;
    }
    
    public void push(int x) {
        if(ptr==size){
            return;
        }
        arr[ptr++]=x;
        
    }
    
    public int pop() {
        if(ptr==0){
            return -1;
        }
        return arr[--ptr];
    }
    
    public void increment(int k, int val) {
        if(k>size){
        for(int i=0;i<size;i++){
            arr[i]+=val;
        }
        }
        if(k<size){
            for(int i=0;i<k;i++){
            arr[i]+=val;
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
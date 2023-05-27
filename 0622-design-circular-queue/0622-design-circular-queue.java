class MyCircularQueue {
    int arr[];
    int front;
    int rear;
    public MyCircularQueue(int k) {
        this.arr=new int[k];
        this.front=-1;
        this.rear=-1;
    }
    
    public boolean enQueue(int value) {
         if(front==-1 && rear ==-1){
             front=rear=0;
             arr[rear]=value;
             return true;
         }
        
        else if((rear+1)%arr.length==front){
            return false;
        }
        else{
            rear=(rear+1)%arr.length;
            arr[rear]=value;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(front==-1 && rear ==-1){
            return false;
        }
      else if(rear==front){
            rear=-1;
            front=-1;
            return true;
        }
        else{
            front=(front+1)%arr.length;
            return true;
        }
    }
    
    public int Front() {
        if(front==-1 && rear==-1){
            return -1;
        }
        return arr[front];
    }
    public int Rear(){
        if(rear==-1 && front==-1){
            return -1;
        }
        return arr[rear];
    }
    
    
    public boolean isFull() {
        return (rear+1)%arr.length==front;
    }
    public boolean isEmpty(){
        return (front==-1 && rear==-1);
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
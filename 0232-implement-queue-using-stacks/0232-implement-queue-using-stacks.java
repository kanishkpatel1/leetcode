//class MyQueue {
    
//      static Stack<Integer>s1=new Stack<>();
//         static Stack<Integer>s2=new Stack<>();
//     public MyQueue() {
        
//     }
    
//     public void push(int data) {
//               //step-1
//             while(!s1.isEmpty()) { // jab tk s1 empty nhi hota s1 ka data s2 me push hoga
//             s2.push(s1.pop());
//             }
//                // step-2
//             s1.push(data);     
//             //step-3
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//     }
    
//     public int pop() {
        
//             return s1.pop();
//     }
    
//     public int peek() {
      
//             return s1.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty() && s2.isEmpty(); 
//     }
    
    
//}
    class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
        
    public MyQueue() {
      
    }
    
    public void push(int x) {
       if(stack1.isEmpty()){
           stack1.push(x);  // pushing in stack1
           return;
       }        
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop()); // first Popping in stack1 then pushing stack1's pop value in stack2
            // stack1.pop();
        }
        stack1.push(x);
        while(!stack2.empty()){
            stack1.push(stack2.pop()); // first Popping in stack2 then pusing stack2's pop value in stack1
            // stack2.pop();
        }
    }
    
    public int pop() {
        return stack1.pop(); // Popping in stack1 
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
       return stack1.isEmpty() && stack2.isEmpty();   
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
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        int j=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            stk.push(pushed[i]);// first we will have to  store the value in stack 
            while(!stk.empty() && stk.peek()==popped[j]){ 
// check if the last stored value in the stack is matched with the popped[j] 
//if matched then remove value from stack and increase the j counter to check again and again 
//till the stack not empty after all operations if the stack is empty then return true
                
                stk.pop();
                j++;
            }
        }
      return stk.empty();
    }
}
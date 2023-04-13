class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        int j=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            stk.push(pushed[i]);
            while(!stk.empty() && stk.peek()==popped[j]){
                stk.pop();
                j++;
            }
        }
      return stk.empty();
    }
}
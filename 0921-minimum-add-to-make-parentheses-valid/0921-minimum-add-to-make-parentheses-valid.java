class Solution {
    public int minAddToMakeValid(String s) {
      Stack<Character> stk=new Stack<>();
        char []arr=s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
          
            if(!stk.empty() && arr[i]==')' && stk.peek()=='('){
                stk.pop();
            }
            else{
                stk.push(arr[i]);
            }
        }
       return stk.size();
    }
}
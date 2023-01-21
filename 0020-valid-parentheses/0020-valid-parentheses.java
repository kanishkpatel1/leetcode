class Solution {
    public boolean isValid(String str) {
          char arr[]=str.toCharArray();
            Stack<Character> stk=new Stack<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='(')
                    stk.push(')');
                else if(arr[i]=='{')
                    stk.push('}');
                else if(arr[i]=='[')
                    stk.push(']');
                
                else if(stk.isEmpty()|| stk.pop()!=arr[i]){
                    return false;
                }
            }

// if String is valid paranthesis then stack must have empty after 
//performing all operations            
            return stk.isEmpty();  
    }
}
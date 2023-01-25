class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> braces=new Stack<>();
        Stack<Integer> index=new Stack<>();
        int max=0;
        index.push(-1);  // default value
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                braces.push('(');
                index.push(i);
            } 
            else{ 
    // str.charAt(i)==')' closing bracket we will get only two either open or close
                if(!braces.isEmpty()&& braces.peek()=='('){
                    braces.pop();
                    index.pop();
                    max=Math.max(max,i-index.peek());
                }
                else{
                    index.push(i);
                }
            }
        }
        return max;
    }
}
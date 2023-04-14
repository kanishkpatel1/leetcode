class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                    stk.push(s.charAt(i));
            }
            else {
                while(stk.peek()!='('){
                    str+=stk.pop();
                }
                stk.pop();
                for(int j=0;j<str.length();j++){
                    stk.push(str.charAt(j));
                }
                str="";
            }
        }
        while(!stk.empty()){
            str=stk.pop()+str;
        }
        return str;
    }
}
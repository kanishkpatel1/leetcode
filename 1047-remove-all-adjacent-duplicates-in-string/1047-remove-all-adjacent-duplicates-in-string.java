class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk =new Stack();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && stk.peek()==s.charAt(i) ){
                stk.pop();
                
            }
            else{
                stk.add(s.charAt(i));  
                // now characters are in reverse order so we use string builer for reverse                         //character and then return the string
            }
        }
       while(!stk.isEmpty()){
           str.append(stk.pop());   // add chars to stringbuilder
       }
        return str.reverse().toString();    // reverse and convert to string 
    }
}
class Solution {
    public int calculate(String s) {
        
        Stack<Integer> st=new Stack<>();
        char prevSign='+';
        int n=0; //number
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
        
            n=n*10+(ch-'0'); }
             if(isOperator(ch) || i==s.length()-1){
                 if(prevSign=='+'){
                    st.push(n);}
             
                   else if(prevSign=='-'){
                    st.push(-n);}
             
                  else if(prevSign=='*'){
                      int top=st.pop();
                    st.push(top*n);}
        
                else if(prevSign=='/'){
                      int top=st.pop();
                    st.push(top/n);}
                 n=0;
                 prevSign=ch;
             }
            
        }
        int result=0;
        while(!st.empty()){
            result+=st.pop();
        }
        return result;
        
        
    }
    public boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/';
    }
}
class Solution {
    public int calculate(String s) {
         Stack<Integer> st=new Stack<>();
        int sum=0;
        int sign=1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // if character is --> 4578
            // then we will iterate it one by one and at last add it to the sum
            if(Character.isDigit(ch)){
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                    // with these steps we will go 1 step forward
                }
                // to remove that one step 
                i--;
                val=val*sign;
                sign=1;
                sum+=val;
            }
            // if opening bracket then store the sum and sign in the stack and
            // make the value of sum is 0
            else if(ch=='('){
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=+1;
            }
            else if(ch==')'){
                sum*=st.pop();
                sum+=st.pop();
            }
            else if(ch=='-'){
                sign*=-1;
            }
            
            
        }
        return sum;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stra=new Stack<>();
        for(String str: tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*")                    ||  str.equals("/")){
                
                int a2=Integer.parseInt(stra.pop());
                int a1=Integer.parseInt(stra.pop());
                int ans=0;
                if(str.equals("*")){
                    ans=a1*a2;
                }
                else if(str.equals("/")){
                    ans=a1/a2;
                }
                 else if(str.equals("+")){
                    ans=a1+a2;
                }
                 else if(str.equals("-")){
                    ans=a1-a2;
                }
                stra.push(ans+"");
            }
            else{
                stra.push(str);
            }  
        } 
        return Integer.parseInt(stra.peek());
    }
    
}
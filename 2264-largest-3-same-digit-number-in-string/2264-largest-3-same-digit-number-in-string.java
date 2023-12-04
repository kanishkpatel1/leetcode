class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        
        int m=0;
        boolean temp=false;
        for(int i=2;i<num.length();i++){
           
               String substr=num.substring(i-2,i+1);
            boolean check= checksame(substr);
            if(check){
                if(substr.charAt(0)>=m){
                    max=substr;
                    m=substr.charAt(0);
                }
            }
            
            
        }
       return max;
    }
    public boolean checksame(String num){
         return (num.charAt(2)==num.charAt(0) && num.charAt(0)==num.charAt(1));   
    }
}
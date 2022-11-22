class Solution {
    public String replaceDigits(String s) {
               String sr="";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
           
           int a=s.charAt(i)-'0';
           int b=s.charAt(i-1);
           char cs=(char)(a+b);
           sr+=cs;
            }
            else{
                 sr+=s.charAt(i);
            }
           
        }
        return sr;

    }
}
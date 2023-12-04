class Solution {
    public String largestGoodInteger(String num) {
        String max="000";
        boolean temp=false;
        for(int i=2;i<num.length();i++){
            if(num.charAt(i-2)==num.charAt(i) && num.charAt(i)==num.charAt(i-1)){
               String n="";
                temp=true;
                n+=num.charAt(i-2);
                n+=num.charAt(i-1);
                n+=num.charAt(i);
                if(n.charAt(0)>max.charAt(0)){
                    max=n;
                }
            }
        
        }
       
        return temp?max:"";
    }
}
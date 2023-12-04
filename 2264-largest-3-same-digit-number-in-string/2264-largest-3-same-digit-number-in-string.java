class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        boolean temp=false;
        for(int i=2;i<num.length();i++){
            if(num.charAt(i-2)==num.charAt(i) && num.charAt(i)==num.charAt(i-1)){
                String substr=num.substring(i-2,i+1);
              if(substr.compareTo(max)>0){
                  max=substr;
              }
            }
        
        }
       
        return max;
    }
}
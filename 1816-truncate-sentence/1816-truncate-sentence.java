class Solution {
    public String truncateSentence(String s, int k) {
       String[] str=s.split(" ");
        String ret="";
        for(int i=0;i<k;i++){
            ret+=str[i];
            if(i<k-1){
            ret+=" ";
            }
            
        }
        return ret;
    }
}
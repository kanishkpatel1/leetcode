class Solution {
    public String truncateSentence(String s, int k) {
       String[] str=s.split(" ");
        String ret="";
        for(int i=0;i<k-1;++i){
            ret+=str[i];
    
            ret+=" ";
            
            
        }
        ret+=str[k-1];  // for last word that are left because of space 
        return ret;
    }
}
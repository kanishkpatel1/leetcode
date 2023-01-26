class Solution {
    public String mergeAlternately(String word1, String word2) {
              int a=word1.length();
        int b=word2.length();
        int m=Math.max(a, b);
        String res="";
        int w1=0,w2=0;
        for(int i=0;i<m;i++){
            if(w1<a){
            res+=word1.charAt(w1++);
            }
            if(w2<b){
            res+=word2.charAt(w2++);}
        }
        return res;
    }
}
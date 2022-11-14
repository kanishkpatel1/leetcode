class Solution {
      public static String reversePrefix(String word, char ch) {
        String brr="";
        int a=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                a=i;
                break;
            }}
            for(int i=a;i>=0;i--){
                brr+=word.charAt(i);
            }
            for(int i=a+1;i<word.length();i++){
                brr+=word.charAt(i);
            }
        return brr;
}
}
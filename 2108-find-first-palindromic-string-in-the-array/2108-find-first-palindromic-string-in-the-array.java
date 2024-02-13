class Solution {
    public static String firstPalindrome(String[] words) {
        for(String str:words){
            if(check(str)){
                return str;
            }
        }
        return "";
    }
    public static boolean check(String str){
       int i=0;
       int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
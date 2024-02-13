class Solution {
    public static String firstPalindrome(String[] words) {
        for(String str:words){
            if(check(str)){
                return str;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String  str[]={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(str));
    }
    public static boolean check(String str){
        String newstr="";   
        for(int i=str.length()-1;i>=0;i--){
            newstr+=str.charAt(i);
        }
        return str.equals(newstr);
    }
}
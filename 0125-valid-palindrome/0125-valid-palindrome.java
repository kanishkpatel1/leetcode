class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
        if((s.charAt(i)<='z'&&s.charAt(i)>='a') || (s.charAt(i)<='9'&& s.charAt(i)>='0')){
            str+=s.charAt(i);
        }
        }
        System.out.println(str);
        String stra="";
        for(int i=str.length()-1;i>=0;i--){
            stra+=str.charAt(i);
        }
        System.out.println(stra);
        if(str.equals(stra)){
            return true;
        }
        return false;
    }
}
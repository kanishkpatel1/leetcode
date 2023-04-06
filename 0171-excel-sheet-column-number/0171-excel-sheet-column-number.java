class Solution {
    public int titleToNumber(String str) {
        int n=0;
        for(int i=0;i<str.length();i++){
            n=n*26+(str.charAt(i)-'A')+1;
        }
                     return n;
    }
}
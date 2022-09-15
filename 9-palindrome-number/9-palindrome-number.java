class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int rev=0;
        int s=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            rev=+x%10;
            s=s*10+rev;
                x=x/10;
        }
       if(s==y){
           return true;
       }
    return false;
    }
}
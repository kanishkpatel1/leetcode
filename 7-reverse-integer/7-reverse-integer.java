class Solution {
    public int reverse(int x) {
        int y=1;
if(x<0){
    x=x-2*x;
     y=0;
}
        int rem=0;
        long rev=0;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
         }
    if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
        return 0;
    }
        int ass=(int)rev;
       if(y==0){
           ass=ass-2*ass;
           
           return ass;
       }
       return ass; 
    }
}
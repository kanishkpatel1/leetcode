class Solution {
    public int numberOfMatches(int n) {
       int a=0,sum=0;
        while(n>1){
            if(n%2==0){
                n=n/2;
                sum+=n;
            }
            else{
                sum+=n/2;
                n=(n+1)/2;
            }
            
        }
        return sum;
    }
}
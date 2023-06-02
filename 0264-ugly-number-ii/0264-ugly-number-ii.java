class Solution {
   
    public int nthUglyNumber(int n) {
        int dp[]=new int[n];
        dp[0]=1;
        int a=0;
        int b=0;
        int c=0;
        
        for(int i=1;i<n;i++){
            int two=dp[a]*2;
            int three=dp[b]*3;
            int five=dp[c]*5;
            dp[i]=Math.min(two,Math.min(three,five));
            if(two==dp[i])a++;
            if(three==dp[i])b++;
            if(five==dp[i])c++;
        }
        return dp[n-1];
    }
}
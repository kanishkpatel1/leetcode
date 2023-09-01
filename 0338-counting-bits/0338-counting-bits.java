// We iterate over from i = 2 to i = n, and for each number we store its result in a dp array.

// Now what we do to find number of bits is, we add remainder when number is divided by to dp[i/2], this is done because //lets say we have 5, now to find 1 bits as i showed above we keep on dividing 5 till we get 0, but when we divide 5 by 2 // just once, we get 2, now we already have calculated number of 1 bits for 2 so why not use just that and save our time? // We do exactly that in this approach and beat 100% of solutions.

class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        if(n==0){
            return ans;
        }
        ans[0]=0;
        ans[1]=1;
        
        for(int i=2;i<=n;i++){
            ans[i]=i%2+ans[i/2];
        }
        return ans;
    }
}
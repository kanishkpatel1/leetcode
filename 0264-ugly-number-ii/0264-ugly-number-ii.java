class Solution {
   
    public int nthUglyNumber(int n) {
        int dp[]=new int[n];
        dp[0]=1;
        int a=0;
        int b=0;
        int c=0;
        
        // 
        for(int i=1;i<n;i++){ 
// multiply krne ke value hameskha dp ki table se uthayenge jisse  not ugly wala milne ka chance hi na rhe 
// because agr 42 hai to 2 se divide hone ke baad 21 bchega matlab 2*21 ya 3*7 ya 2*7 in cases se bachne ke liye dp table se value uthake multiply krenge bss
            
            int two=dp[a]*2; // multiple of 2
            int three=dp[b]*3;   // multiple of 2
            int five=dp[c]*5;     // multiple of 2
            
            dp[i]=Math.min(two,Math.min(three,five));  // store the minimum number among three4
            
            if(two==dp[i])a++;   // increase the pointer jiska answer tumne store kiya hai agr do same r
            if(three==dp[i])b++;  // hai to dono ka pointer increase krdo 
            if(five==dp[i])c++;
        }
        return dp[n-1];  // last wala element array se return krdo wahi answer hai bhai
    }
}
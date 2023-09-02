    // dp[i] = minimum characters left for string[0...i]
    // dp[i] = dp[i-1] + 1 (base case, if no match is found)
    // dp[i] = min(dp[i], dp[i - len(s[i..j])]), if the substring is in dictionary

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n=s.length();
       int dp[]=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]+1;
            
            for(String str:dictionary){
                int l=str.length();
                if(i>=l && s.substring(i-l,i).equals(str)){
                    dp[i]=Math.min(dp[i],dp[i-l]);
                }
            }
        }
        return dp[n];
    }
}
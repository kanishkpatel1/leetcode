class Solution {
    public int minDistance(String word1, String word2) {
        int r=word1.length();
        int c=word2.length();
        
        int dp[][]=new int[r+1][c+1];
        // fill the first row and first col with index values because of diff 
        for(int i=1;i<=c;i++)  dp[0][i]=i; //first row
        for(int i=1;i<=r;i++)  dp[i][0]=i;
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]; // condition for same character in both strings
                }
                else{
                int top=dp[i-1][j];
                int topleft=dp[i-1][j-1];
                int left=dp[i][j-1];
                dp[i][j]=Math.min(top,Math.min(topleft,left))+1;
                }
            }
        }
     return dp[r][c];
    }
}
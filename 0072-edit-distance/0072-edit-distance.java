class Solution {
    public int minDistance(String word1, String word2) {
        int row=word1.length()+1;
        int col=word2.length()+1;
        int dp[][]=new int[row][col];
        for(int i=0;i<col;i++) dp[0][i]=i;       // fill the first row
        for(int i=0;i<row;i++) dp[i][0]=i; // fill the first cool
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                   dp[i][j]=dp[i-1][j-1]; 
                else
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
            }
        }
        return dp[row-1][col-1];
    }
}
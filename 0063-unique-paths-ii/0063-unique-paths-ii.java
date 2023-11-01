class Solution {
 public static int uniquePathsWithObstacles(int[][] arr) {
        if(arr[0][0]==1){
            return 0;
        }
         int dp[][]=new int[arr.length][arr[0].length];
         for(int i=0;i<arr.length;i++){
            if(arr[i][0]==1){
                break;
            }
            else{
                dp[i][0]=1;
            }
         }
         for(int i=0;i<arr[0].length;i++){
            if(arr[0][i]==1){
                break;
            }
            else{
                dp[0][i]=1;
            }
         }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                    if(arr[i][j]==1){
                       dp[i][j]=0; 
                    }
                    else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                
            }
        }
            return dp[arr.length-1][arr[0].length-1];

    }
}
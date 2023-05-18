// Method 3--> using 2d  matrix length +1 for detailed explanation see notes 
// Using dp most optimized solution for this problem
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
           int [][]dp=new int[text1.length()+1][text2.length()+1];
        
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                  if(text1.charAt(i-1)==text2.charAt(j-1)){
                      dp[i][j]=dp[i-1][j-1]+1;
                  }
                    else{
                        dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
            }
        return dp[text1.length()][text2.length()];
    }
}





// // Method 2--> Optimized using dp 

// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//                int [][]dp=new int[text1.length()+1][text2.length()+1];
//             for(int i=0;i<dp.length;i++){
//                 for(int j=0;j<dp[0].length;j++){
//                     dp[i][j]=-1; // fill -1 initially in the array
//                 }
//             }
//         return helper(text1,text2,0,0,dp);
//      }
    
//     int helper(String text1,String text2,int i,int j,int[][]dp){
//         if((i>text1.length()-1)|| (j>text2.length()-1)){
//             return 0;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(text1.charAt(i)==text2.charAt(j)){
//             return 1+helper(text1,text2,i+1,j+1,dp);
//         }
//         else{
//             dp[i][j]= Math.max(helper(text1,text2,i,j+1,dp),helper(text1,text2,i+1,j,dp));
//             return dp[i][j];
//         }
//     }
// }



// Method --> 1
// Recursive --> TLE
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         return helper(text1,text2,0,0);
//     }
    
//     int helper(String text1,String text2,int i,int j){
//         if((i>text1.length()-1)|| (j>text2.length()-1)){
//             return 0;
//         }
//         if(text1.charAt(i)==text2.charAt(j)){
//             return 1+helper(text1,text2,i+1,j+1);
//         }
//         else{
//             return Math.max(helper(text1,text2,i,j+1),helper(text1,text2,i+1,j));
//         }
//     }
// }





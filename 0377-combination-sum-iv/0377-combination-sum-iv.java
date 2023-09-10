// // recursion will give tle
// TC-> O(N^target)
// class Solution {
//     public int combinationSum4(int[] nums, int target) {
//       if(target==0) {
//           return 1;
//       }
//         int res=0;
//         for(int i:nums){
//             if(i<=target){
//                 res+=combinationSum4(nums,target-i);
//             }
//         }
//         return res;
//     }
// }

// Using dp
// TC-> O(N*target)
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[]=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int n:nums){
                if(i>=n){
                    dp[i]+=dp[i-n];
                }
            }
        }
        return dp[target];
        
    }
}
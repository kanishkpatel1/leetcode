// see notes for detailed explanation

class Solution {
    public int rob(int[] nums) {
       int dp[]=new int[nums.length]; // to store maximum amount at each testcases
        
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);  // store the value for two index in dp
        
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);  // store maximum amount in dp
        }
        return dp[dp.length-1];
    }
}
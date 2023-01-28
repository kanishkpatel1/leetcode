class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);  // calculate every time max from sum 
            
            if(sum<0){
                sum=0;  // whenever our sum will less from 0 reset it to 0
            }
        }
        return max;
    }
}
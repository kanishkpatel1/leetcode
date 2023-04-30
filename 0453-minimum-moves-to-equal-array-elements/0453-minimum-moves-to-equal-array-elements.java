class Solution {

    public int minMoves(int[] nums) {
        int ans=0;
        int min = nums[0];
        // In it we use simple approach first calculate the min number of the array and after that find the difference of each ele 
        // with the min number because in each step we can increment only 1 times so calculate sum of difference that is our ans
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
        ans+=nums[i]-min;
        }
        return ans;
    }
}

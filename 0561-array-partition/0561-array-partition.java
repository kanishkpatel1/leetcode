class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
            }
            else{
                sum+=nums[i+1];
            }
        }
        return sum;
    }
}
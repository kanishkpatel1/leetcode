class Solution {
    public int findMin(int[] nums) {
        int min=6000;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                }
            }
        }
        return min;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
         int point=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[point-2]){
                nums[point]=nums[i];
                point++;
            }
        }
        return point;
    }
}
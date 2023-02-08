class Solution {
    public boolean canJump(int[] nums) {
        int li=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=li-i){
                li=i;
            }
        }
        if(li==0){
            return true;
        }
        else{
            return false;
        }
    }
}
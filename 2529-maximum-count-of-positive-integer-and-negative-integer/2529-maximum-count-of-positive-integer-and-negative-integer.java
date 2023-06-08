class Solution {
    public int maximumCount(int[] nums) {
        int mincount=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                mincount++;
            }
            else if(nums[i]==0){
                zero++;
                continue;
            }
            else{
                break;
            }
        }
        return Math.max(mincount,nums.length-mincount-zero);
    }
}
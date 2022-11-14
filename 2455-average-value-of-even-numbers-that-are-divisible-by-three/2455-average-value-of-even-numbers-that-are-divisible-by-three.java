class Solution {
    public int averageValue(int[] nums) {
        int res=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                a++;
                res+=nums[i];
            }
        }
        if(a>0){
        return res/a;
        }
        return a;
    }
}
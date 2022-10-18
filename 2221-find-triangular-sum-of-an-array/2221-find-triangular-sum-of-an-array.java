class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int a=n;
        while(a!=0){
            for(int j=0;j<a-1;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
                // because of digit between 0-9
            }
            a--;
        }
        return nums[0];
    }
}
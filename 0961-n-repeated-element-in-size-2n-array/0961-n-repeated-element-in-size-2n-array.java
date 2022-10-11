class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int sum=1;
        int a=0;
        int n=nums.length/2;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            sum++;
            if(sum==n){
                a=nums[i];
                
            }
        }
    }
        return a;
    }
}
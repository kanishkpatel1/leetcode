class Solution {
    public int maxIceCream(int[] nums, int coins) {
      Arrays.sort(nums);
         int sum=0;
        for(int i=0;i<nums.length;i++){
                   if(coins>=nums[i]){
                       sum++;
                       coins-=nums[i];
                   
            }
        }
        return sum;
    }
}
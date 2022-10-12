class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0],max=nums[0];
      for(int i = 0; i <nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
      }
        if(min+k>=max-k){
            return 0;
        }
        return (max-k)-(min+k);
    }
}
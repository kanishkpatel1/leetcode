class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         System.out.println(Arrays.toString(nums));
         int count=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
           
            if(nums[i]==nums[i-1]){
                count++;
              if(count>=n/2){
                return nums[i];
               }
            }
            else{
                count=0;
            }


        }
        return -1;
    }
}
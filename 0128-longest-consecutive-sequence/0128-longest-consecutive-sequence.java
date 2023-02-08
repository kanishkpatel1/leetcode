class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;  // base case
        Arrays.sort(nums);
        int count=1;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;           // to remove duplicate if duplicates exist we simply execute loop again
            }
            if(nums[i]+1==nums[i+1]){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;  // if values are different reset count
            }
        }
        max=Math.max(max,count);   // after all execution again check the value of count 
        return max;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int diff=Integer.MAX_VALUE;
    
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
        
             int end=nums.length-1;
           
           
            while(start<end){
                 int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(diff-target)>Math.abs(sum-target)){
            
                    diff=sum;
                    
                }
               if(sum<target){ 
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return diff;
    }
}
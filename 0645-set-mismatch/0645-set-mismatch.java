class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=0;
        int n=nums.length;
        int sum=0;
        int c=n*(n+1)/2; // sum of n terms
        int b=0;
        Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1]){
               a=nums[i];   // find duplicate
               break;
           }
       } 
        
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
     }   
        b=c+a-sum;
        
        return new int[]{a,b};
    }
}
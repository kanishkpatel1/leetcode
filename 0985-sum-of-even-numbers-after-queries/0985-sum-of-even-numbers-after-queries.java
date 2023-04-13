class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int sum=0;  // it will store the sum of even numbers
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        
      //   System.out.println(sum);
        for(int i=0;i<n;i++){
            if(nums[queries[i][1]]%2==0){
                sum-=nums[queries[i][1]];
                 nums[queries[i][1]] += queries[i][0];
                if(nums[queries[i][1]]%2==0){
                    sum+=nums[queries[i][1]];
                   
                }
              
            }
            else{
                nums[queries[i][1]] += queries[i][0];
                 if(nums[queries[i][1]]%2==0){
                    sum+=nums[queries[i][1]];
                }
               }
            res[i]=sum;
           
        }
        return res;
    }
}
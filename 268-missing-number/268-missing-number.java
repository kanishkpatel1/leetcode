class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
        int a=0;
       int b=n*(n+1)/2;
       
        for(int i=0;i<n;i++){
        a=a+nums[i];
            
            }
        return b-a;
        }
        
    }

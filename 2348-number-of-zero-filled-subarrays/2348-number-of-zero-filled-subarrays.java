class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // Dry run it on copy you will understand the logic behind it and read the given hits also 
        long ans=0;
       
        for(int i=0;i<nums.length;i++){
        int curr=0;
            while(i<nums.length && nums[i]==0){
                curr++;
                ans+=curr;
                i++;
            }
        }    
        return ans;
        }
    
    }

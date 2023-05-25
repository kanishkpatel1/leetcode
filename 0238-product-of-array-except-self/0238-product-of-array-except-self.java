class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int mul=1;
        int zero=0;
        int ind=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               
               zero++;
           }
           mul*=nums[i];
       } 
        int mult=1;
        if(zero==1){
            for(int i=0;i<nums.length;i++){
               if(nums[i]==0){
                   ind=i;
                   continue;
               } 
                mult=mult*nums[i];
            }
        }
        if(zero>1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i]=0;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            res[i]=mul/nums[i];
        }
        if(zero==1){
        res[ind]=mult;}
        return res;
    }
}
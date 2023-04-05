class Solution {
    public int minimizeArrayValue(int[] nums) {
        int res=nums[0];
    long curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr+=nums[i];
           // res=Math.max(res,curr/(i+1)); 
            //by above line we will not get proper avg curr/(i+1) so i defined another avg method to get avg acc to question
            res=Math.max(res,(int)avg(curr,i+1)); 
        }
        return res;
    }
    public long avg(long a,int b){  
    // method for finding avg of two number like Math.ceil function of python increase when not divisible
        if(a%b!=0){
            return (a/b)+1;
        }
        else{
            return a/b;
        }
    }
}
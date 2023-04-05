
// Intuition behind this is to be greedy and calculate the sum of each subarray and divide it by the length of the subarray and store the max result each time.
// You ask me why?
// Well lets say we have an array [3,7]. How many times we can perform the operation? Well lets count : In first operation we will have [4,6]. In second operation we will have [5,5]. well thats as far as we can go given the condition that we need to minimize the max sum.
// Now see this other way, if I took sum of [3,7] and divide it be length of subarray what we will get? Its 5 obviously, right? So keeping that in mind we will continue our implementation.


class Solution {
    public int minimizeArrayValue(int[] nums) {
        int res=nums[0];
    long curr=nums[0];// we take long variable because sum can be go beyond the limit
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
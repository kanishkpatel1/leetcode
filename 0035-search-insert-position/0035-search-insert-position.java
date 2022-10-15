//by using binary search

class Solution {
    public int searchInsert(int[] nums, int target) {
    int l=0;  // for low pointer
    int h=nums.length-1;   // for high pointer
   
    while(l<=h) {
         int middle=l+(h-l)/2;
        if(nums[middle]==target){
            return middle;
        }
        else if(nums[middle]>target){
            h=middle-1;
        }
        else{
            l=middle+1;
        }
    }   
      return l;  
    }
}
class Solution {
    public int arraySign(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                s++;   // here we count how many times minus digit occured if it is occured even time then it is +ve
            }
        }
          if(s%2==0){
              return 1;
          }
        return -1;
        }
}
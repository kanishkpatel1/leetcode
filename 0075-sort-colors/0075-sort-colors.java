class Solution {
    public void sortColors(int[] nums) {
        int temp;
        
      for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length;j++){
              if(nums[j]>nums[i]){
              temp=nums[i];
              nums[i]=nums[j];
                  nums[j]=temp;
                 
                  }
          }
      }  
    }
}
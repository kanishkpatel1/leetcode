class Solution {
    public int[] twoSum(int[] nums, int target) {
      int left=0;
        int right=nums.length-1;
        int arr[]=new int[2];
        if(nums.length<2){
            return arr;
        }
        while(left<right){
            int a=nums[left]+nums[right];
            if(a==target){
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            else if(a>target){ 
                right--;
                
            }
            
            else {
                left++;
            }
        }
        return arr;
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []arr=new int[nums.length];
        int l=nums.length;
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<l;j++){
                
                if(nums[(i+j)%l]>nums[i]){
                    
                    arr[i]=nums[(i+j)%l];    
                    break;
                }
                else{
                    arr[i]=-1;
                }
            }
        }
        return arr;
    }
}
class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
        //int arr[]=Arrays.copyOf(nums,nums.length);
        int arr[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        
        
        //for odd positions
        for(int i=1;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }
      //  for even positions
         for(int i=0;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }
    }
}
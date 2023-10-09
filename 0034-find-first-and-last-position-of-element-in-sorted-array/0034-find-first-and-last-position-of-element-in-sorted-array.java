class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        Arrays.fill(arr,-1); // fill -1 initially
        arr[0]=leftpos(nums,target);
        arr[1]=rightpos(nums,target);
        return arr;
    }
    // function to calculate the index from left side
    static int leftpos(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left-(left-right)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target){
                index=mid;
            }
        }
        return index;
        
    }
    // function to find the index of target from right side
    static int rightpos(int[] nums,int target){
         int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left-(left-right)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            if(nums[mid]==target){
                index=mid;
            }
        }
        return index;
    }
}
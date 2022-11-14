class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int b=n-k;
        int[] arr=new int[n];
        int a=0;
        for(int i=b;i<n;i++){
            arr[a++]=nums[i];
        }
        for(int i=0;i<b;i++){
            arr[a++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}
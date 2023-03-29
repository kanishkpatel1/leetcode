class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n];
        int l=0;
        for(int i=1;i<n;i++){
            l=l+nums[i-1];
            left[i]=l;
        }
        int r=0;
        for(int j=n-1;j>=0;j--){
           right[j]=r;
            r+=nums[j];
            }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        
        for(int i=0;i<n;i++){
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
    }
}
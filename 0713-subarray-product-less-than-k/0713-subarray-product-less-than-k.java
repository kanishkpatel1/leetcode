class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int product=1;
        int ans=0;
        int n=nums.length;
        while(j<n){
            product*=nums[j];
            while(i<=j && product>=k){ //  remove elements from window when product value increases from k
                product/=nums[i];  //remove the element from left of the window
                i++;
            }
            
            ans+=j-i+1;   // calculate the ans 
            j++;
        }
        return ans;
    }
}
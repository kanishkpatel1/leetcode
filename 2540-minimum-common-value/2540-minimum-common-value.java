class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        while(a<nums1.length && b<nums2.length ){
            if(nums1[a]<nums2[b]){
                a++;
            }
            else if(nums2[b]<nums1[a]){
            b++;    
            }
            else{
                return nums1[a];
            }
        }
        return -1;
    }
}
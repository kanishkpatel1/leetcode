class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // using two pointer approach 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
            nums1[k++]=nums2[j];
                i++;
                j++;
                }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int arr[]=new int[k];
        for(int a=0;a<k;a++){
            arr[a]=nums1[a];
        }
        return arr;
    }
}
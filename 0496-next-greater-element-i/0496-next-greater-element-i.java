class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int res[]=new int[nums1.length];
        Map<Integer,Integer> mp=new HashMap<>();
          for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i);  // to store the particular position of the elements
       } 
       for(int i=0;i<nums1.length;i++){
           res[i]=-1; // set defaul if we didn't find any value greater than nums[i] then store it
            for(int j=mp.get(nums1[i])+1;j<nums2.length;j++){  
                //j loop will start in nums2 where we find the element==nums[i] +1 indx
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    break;
                }
               
            }
       } 
        return res;
    }
}
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        
        for(int n:nums1){
            s1.add(n);
        }
         for(int n:nums2){
            s2.add(n);
        }
        
        for(int n:s1){
            if(!s2.contains(n)){
                ls1.add(n);
            }
        }
        
        for(int n:s2){
            if(!s1.contains(n)){
                ls2.add(n);
            }
        }
        
     
  
        ans.add(ls1);
        ans.add(ls2);
        return ans;
    }
}
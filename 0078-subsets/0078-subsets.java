// Iterative approach
// see notes for detailed explanation
// analyze it for [1,2,3]--> ans will be--> [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> ans=new ArrayList<>();
//         ans.add(new ArrayList()); // add empty array list -> []
//         for(int num:nums){
//         int n=ans.size();
//         for(int i=0;i<n;i++){
//             List<Integer>temp=new ArrayList(ans.get(i));  // steps --> [] --> [],[1]-->[],[1],[2],[1,2]--> [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
//             temp.add(num);
//             ans.add(temp);
//           }
//         }
//         return ans;
//     }
// }


// recursive approach
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generate(res, nums, 0, new ArrayList<>(), nums.length);
        return res;
    }
    
    private void generate(List<List<Integer>> wrapper, int[] nums, int i, List<Integer> tempSubset, int n) {
        if (i >= n) { // Base case
            wrapper.add(new ArrayList<>(tempSubset));
            return;
        }
        
		// picking the i-th indexed element and inserting it in temp-list
        tempSubset.add(nums[i]);
        generate(wrapper, nums, i + 1, tempSubset, n);
		
        // removing i-th indexed element and ignoring it
        tempSubset.remove(tempSubset.size() - 1);
        generate(wrapper, nums, i + 1, tempSubset, n);
        
        return;
    }
    
}
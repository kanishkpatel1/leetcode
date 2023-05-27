// Iterative approach
// see notes for detailed explanation
// analyze it for [1,2,3]--> ans will be--> [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList()); // add empty array list -> []
        for(int num:nums){
        int n=ans.size();
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList(ans.get(i));  // steps --> [] --> [],[1]-->[],[1],[2],[1,2]--> [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
            temp.add(num);
            ans.add(temp);
          }
        }
        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
        
//     }
// }
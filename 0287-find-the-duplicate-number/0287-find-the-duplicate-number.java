
// It will Give TLE  as we use  O(n^2) time
// class Solution {
//     public int findDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return nums[i];
//                 }
//             }
//         }
//         return -1;
//     }
// }

// 2.Method--> Using HashSet 
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> hs=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(!hs.add(nums[i])){
//                 return nums[i];
//             }
//             else{
//                 hs.add(nums[i]);
//             }
//         }
//         return -1;
//     }
// }


// 3. method
    class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    }
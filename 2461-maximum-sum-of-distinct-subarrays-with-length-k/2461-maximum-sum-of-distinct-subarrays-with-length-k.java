// class Solution {
//   public static long maximumSubarraySum(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         long currsum = 0;
//         long ans = 0;

//       int i=0;
//       int j=0;
//       while(j<nums.length){
//         currsum+=nums[j];
//         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//         if(j-i+1<k){j++; }  //Keep on going forward if it has not hit the window size k
//         else if(j-i+1==k){
//             // If we hit the window size then we will check if there is 
// 			// 	distinct element exactly k times. If we have then we will find
// 			// the max of sums of every window that has exactly k distinct 
// 			// elements in the subarray.
//          if(map.size()==k){ // if all elements are distinct then only the size of the map will be equal to the k 
//             ans=Math.max(ans,currsum);
//          }
//          currsum-=nums[i];  // remove the last value from current sum
//          map.put(nums[i],map.get(nums[i])-1); // decrease the frequency 
//          if(map.get(nums[i])==0){  // if frequency become zero the remove that key from the map
//             map.remove(nums[i]);
//          }
//           i++;
//          j++;
//         }
//         }
//         return ans;
//         }
// }

// Using Set
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, sum = 0;
        int i = 0, j = 0;

        Set<Integer> set = new HashSet<>();

        while (j < nums.length) {
            sum += nums[j];
            while (i < j && (set.contains(nums[j]) || set.size() >= k)) {
                set.remove(nums[i]);
                sum -= nums[i++];
            }

            set.add(nums[j]);

            if (set.size() == k) maxSum = Math.max(maxSum, sum);
            j++;
        }

        return maxSum;
    }
}
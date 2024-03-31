// fill the map with 0 and initial index -1 

// and treat 0 as -1 in nums array and 1 as 1
// store the sum in the map with index 
// if we get the sum as already stored in the map then check for maxlength 
// in this case current length will be current index - map.get index jispe wo sum store hai 
// agr wo sum nhi hai map me to store kr dege
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum+=-1;
            else sum+=1;
            
            if(map.containsKey(sum)){  // if sum store in the map get the index and subtract it from current index to find the subarray of equal n
                int indx=map.get(sum);    // number of 0 and 1
                int len=i-indx;
                ans=Math.max(ans,len);
            }
            
            else{ // store the sum
                map.put(sum,i);
            }
        }
        return ans;
    }
}
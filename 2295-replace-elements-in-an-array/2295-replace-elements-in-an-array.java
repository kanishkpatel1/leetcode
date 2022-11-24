class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
                // In this code we'll use hashmap to store pos with their values;
        HashMap<Integer, Integer> hs = new HashMap<>(); // Integer hashmap
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<operations.length;i++){
            int indx=hs.get(operations[i][0]);
            nums[indx]=operations[i][1];
            //replace the new value in hashmap for again cheking
            hs.remove(operations[i][0]);
            hs.put(nums[indx], indx);
        }
        return nums;
    }
}
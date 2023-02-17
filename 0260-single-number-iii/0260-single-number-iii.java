class Solution {
    public int[] singleNumber(int[] nums) {
       if(nums.length <=2)
            return nums;
        
        int[] result = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1); 
        
        int a=0; // keep track of index for result array
      
        for(int i:map.keySet()){  // iterate hashmap through keys
           if(map.get(i)==1){  // if value of key is 1
               result[a++]=i;
           }
       }
        return result;
    }
}
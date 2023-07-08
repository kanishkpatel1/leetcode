// Approach --> 
// Find frequency using hashmap
// make a min priority queue of size k 
// and when our size is greater than k then we start pop() elements from the que
class Solution {
      public static int[] topKFrequent(int[] nums, int k) {
         int arr[]=new int[k];
         if(nums.length==0){
             return arr;
         }
          
         Map<Integer,Integer> map=new HashMap();
         for(int num:nums){
             map.put(num,map.getOrDefault(num,0)+1);
         }
         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
          // set elements based on freq of map 
          // it will always set min freq element on top
          for(int n:map.keySet()){
              pq.offer(n);
              if(pq.size()>k){
                  pq.poll(); // remove min freq element
              }
          }
          int ind=0;
          while(!pq.isEmpty()){
              arr[ind++]=pq.poll();
          }        
        return arr;

    }
}
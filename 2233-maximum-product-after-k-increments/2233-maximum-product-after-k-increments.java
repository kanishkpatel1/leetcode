class Solution {
         public static int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int mod=1000000000+7;
        long ans=1;
        for(int el:nums){
            pq.offer(el);
        }
        while(k-->0){
            int temp=pq.poll();
            pq.offer(temp+1);
        }
        for(int el:pq ){
            ans*=el;
            ans=ans%mod;
        }
        return (int)ans;

     }
}
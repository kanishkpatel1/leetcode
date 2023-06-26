class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans=0;
      int i=0;
      int j=costs.length-1;
      PriorityQueue<Integer> pq1=new PriorityQueue<>();
      PriorityQueue<Integer> pq2=new PriorityQueue<>();
      while(k-->0){
          // fill pq1 from start till candidates means costs[0] to costs[candidates-1]
          while(pq1.size()<candidates && i<=j){ 
              pq1.offer(costs[i++]);
          }
          // fill pq2 from end till candidates means costs[costs.length-1] to costs[candidates+1]
          while(pq2.size()<candidates && i<=j){
              pq2.offer(costs[j--]);
          }
          int a=pq1.size()>0?pq1.peek():Integer.MAX_VALUE;
          int b=pq2.size()>0?pq2.peek():Integer.MAX_VALUE;
          if(a<=b){
              ans+=pq1.poll();
          }
          else{
              ans+=pq2.poll();
          }
      }
        return ans;
    }
}
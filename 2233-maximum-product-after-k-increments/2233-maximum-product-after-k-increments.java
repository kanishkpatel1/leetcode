// In this question add 1 in the min ele of the array every time 
// for ex -->  1 1 1 1 1 value of k =3
// step -1:    2 1 1 1 1
// step -2:    2 2 1 1 1
// step -3:    2 2 2 1 1
// dry run same for another test case you will get the logic
// multiplication of this will always be maximum
// so maintain a priority que and add 1 untill the value of k be 0
// 
// 

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
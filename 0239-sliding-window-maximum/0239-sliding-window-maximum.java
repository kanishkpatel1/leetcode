//  Brute Force approach --> TLE 
//class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n=nums.length;
//         int res[]=new int[n-k+1];
//         for(int i=0;i<=nums.length-k;i++){
//             int max=nums[i];
//             for(int j=i;j<k+i;j++){
//             if(nums[j]>max) max=nums[j];
//             }
//             res[i]=max;
//         }
//         return res;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int n=nums.length;
        int []res=new int[n-k+1];
        int a=0; // for storing value in res array from 0 
        Deque<Integer>q=new ArrayDeque<>();  // we store indexes in que
        for(int i=0;i<n;i++){
            // remove number out of range k
            if(!q.isEmpty() && q.peek()==i-k){ // when front index is equal to i-k means it is beyond the size k so remove it from que
            q.poll();
            }
            
            // remove smaller numbers in k range when any new number come we check weather we store numbers in que that are less than it so we wil 
            // remove them from the que
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]) { // check elements from last and remove from last
                q.pollLast();
                
            }
            q.offer(i);
            if(i>=k-1){  // means our for loop reached at size k hit the first window so store the maximum of that windo at 0 pos in res array
              res[a++]=nums[q.peek()];  
            }
        }
    return res;        
}
}

// class Solution {    // O(n^2) -->TLE
//     public int[] dailyTemperatures(int[] temperatures) {
//         int ans1[]=new int[temperatures.length];
//         int n=temperatures.length;
//         for(int i=0;i<n;i++){
//             int ans=0;
//             for(int j=i;j<n;j++){
//             if(temperatures[j]>temperatures[i]){
//                 ans=j-i;
//                 break;
//             }
//             }
//             ans1[i]=ans;
            
//         }
//         return ans1;
//     }
// }

// Using Monotonic Stack //TC -> O(n)
class Solution { 
    public int[] dailyTemperatures(int[] temperatures) {
      int ans[]=new int[temperatures.length];
      int n=temperatures.length;   
        Stack<Integer>stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ans[i]=stk.peek()-i;
            }
            stk.push(i);
        }
     return ans;   
}
}
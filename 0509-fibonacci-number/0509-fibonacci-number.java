// class Solution {
//     // recursion 
//     // public int fib(int n) {
//     //     if(n<=1) return n;
//     //     return fib(n-1)+fib(n-2);
//     //  }
    
//     // using dp
    
//      // public int fib(int n) {
//      //     int arr[]=new int [n+1];
//      //     arr[0]=0;
//      //     arr[1]=1;
//      //     for(int i=2;i<=n;i++){
//      //         arr[i]=arr[i-1]+arr[i-2];
//      //     }
//      //    // System.out.println(Arrays.toString(arr));
//      //     return arr[n];
//      // }
    
// //       public int fib(int n) {
// //           int a=0;
// //           int b=0;
// //           for(int i=0;i<n;i++){
              
// //           }
// //       }
// }


// Top down approach 

// class Solution {
//     private int[] dp=new int[31];
//     public int fib(int n) {
//         if(n<=1) return n;
//         if(n==2) return 1;
//         memoize(n);
//         return dp[n];
//     }
    
//     public int memoize(int n){
//         if(dp[n]!=0) return dp[n];
//         if(n<3) return 1;
//         else dp[n]=memoize(n-1)+memoize(n-2);
//         return memoize(n);
//     }
// }


// Optimezed dp

class Solution{
     public int fib(int n) {
         if(n<=1) return n;
         if(n==2)  return 1;
        
          
          int pre1=1;
           int pre2=1;
         int current=0;
          for(int i=3;i<=n;i++){
              current=pre1+pre2;
              pre1=pre2;
              pre2=current;
          }
         return current;
    }
}

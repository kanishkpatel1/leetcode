// Recursivee
// TC-> O(n^2)  --> TLE
// class Solution {
    
//     public int largestRectangleArea(int[] arr) {
//         return maxarea(0,arr.length-1,arr);
//      }
    
//     public int maxarea(int l,int r,int[] arr){
//         if(l>r){
//             return 0;
//         }
//         int minIndex=l;
//         for(int i=l;i<=r;i++){
//             if(arr[i]<arr[minIndex]){
//                 minIndex=i;
//             }
//         }
//         int width=r-l+1;
//         int height=arr[minIndex];
//         return Math.max(width*height,Math.max(maxarea(l,minIndex-1,arr),maxarea(minIndex+1,r,arr)));
//     }
// }

// // Brute Force approach
// TC -> O(N)
// SC-> O(1)

// class Solution {
//     public int largestRectangleArea(int[] arr) {
//         int maxrect=0;
//     for(int i=0;i<arr.length;i++){
//             int j=i;
//             int p=0;
//         while(j>=0 && arr[j]>=arr[i]){  // find left indexes jinki value jyada ya barabar hai curr value ke (arr[i])
//                j--;
//            }
//         p=j; // store the left min index
//         j=i;
//         while(j<arr.length && arr[j]>=arr[i]){
//             j++;  // right side me jayega jabtak koi value curr (arr[i]) se choti na mil jaye
//         }                  
// formula for find the width = j-p-1 and for height= arr[i] so to find rectange area mutiply them
//         maxrect=Math.max(maxrect,(j-p-1)*arr[i]);
            
//         }
//         return maxrect;
//     }
// }



// Best Approach  Using Stack
// TC-> O(N) 
// SC-> O(N)
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stk=new Stack<>();
        int n=heights.length;
        int ns[]=new int[n]; // next smaller array
        int ps[]=new int[n]; // previous smaller array
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>heights[i]){
                ns[stk.peek()]=i;  // store the index in next smaller array 
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            ns[stk.peek()]=n;
            stk.pop(); 
        }
        
        for(int i=n-1;i>=0;i--){
             while(!stk.isEmpty()&& heights[stk.peek()]>heights[i]){
                ps[stk.peek()]=i;  // store the index in previous smaller array 
                stk.pop();
            }
            stk.push(i);
        }
         while(!stk.isEmpty()){
            ps[stk.peek()]=-1;
            stk.pop();
        }
        int maxrectangle=0;
        for(int i=0;i<n;i++){
            maxrectangle=Math.max(maxrectangle,(ns[i]-ps[i]-1)*heights[i]);  // formula for calculate the rectangle
        }
        return maxrectangle;
    }
}
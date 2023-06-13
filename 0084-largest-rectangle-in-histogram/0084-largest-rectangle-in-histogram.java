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
                ps[stk.peek()]=i;  // store the index in next smaller array 
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
            maxrectangle=Math.max(maxrectangle,(ns[i]-ps[i]-1)*heights[i]);
        }
        return maxrectangle;
    }
}
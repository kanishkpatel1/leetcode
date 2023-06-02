// class Solution {
//     public int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals ,(a,b)->Integer.compare(a[0],b[0]));  //sort basis on the first digit of every row)
//        Stack<int[]>stk=new Stack(); // to store the values of intervals array
//         stk.push(intervals[0]);
//        for(int i=1;i<intervals.length;i++){
//            int start2=intervals[i][0];
//            int end2=intervals[i][1];
//            int[] poparr=stk.pop();
//            int start1=poparr[0];
//            int end1=poparr[1];
       
            
//            // [1,5] and [2,4] so merge will be [1,5] or [1,2] and [2,5] so merge will be [1,5]
//            int endmax=Math.max(end2,end1);
//            if(end1>=start2){
//                int merge[]=new int[]{start1,endmax};
//                stk.push(merge);
               
//            }
//            else{
//                stk.push(poparr);
//                stk.push(intervals[i]);
//            }
//        }
        
//     int res[][]=new int[intervals.length][2];
//         for(int i=res.length-1;i>=0;i--){
//             int poparr[]=stk.pop();
//             res[i][0]=poparr[0];
//             res[i][1]=poparr[1];
//         }
//       return res;
//     }
// }
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);

        for(int i=1;i<intervals.length;i++){

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            int[] poparr = stack.pop();  

            int start1 = poparr[0];
            int end1 = poparr[1]; 

            int emax = Math.max(end1,end2);

            if(end1>=start2){
                int[] merge = new int[]{start1,emax};
                stack.push(merge); 

            }
            else{
                stack.push(poparr);
                stack.push(intervals[i]);
            }
        }
        int[][] output = new int[stack.size()][2];

        for(int i = output.length -1; i>=0;i--){
            int[] poparr = stack.pop();
            output[i][0]= poparr[0];
            output[i][1] = poparr[1];

        }
        return output;        
    }
}
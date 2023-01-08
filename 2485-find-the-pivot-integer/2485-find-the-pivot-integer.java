// where tsum=total sum; and csum=currentsum 
// dry run this program once in your copy you will understand the logic

class Solution {
    public int pivotInteger(int n) {
        int tsum=0;
        
        int arr[]=new int[n];
       for(int i=1;i<=n;i++){
           tsum+=i;
           arr[i-1]=i;  // store the index value (from 1 to n) in array and total sum of all elements
       }
        //System.out.println(tsum);
        int csum=0;
        for(int i=0;i<arr.length;i++){
           
            
            if(tsum-csum-arr[i]==csum){ 
        // here we subtract arr[i] beacause it is the element that is present in both sides
                return arr[i];
                
            }
             csum+=arr[i];
        }
        return -1;
    }
}
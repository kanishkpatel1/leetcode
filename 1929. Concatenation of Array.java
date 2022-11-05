class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int a=0;
        int []brr =new int[2*n];
        for(int i=0;i<2*n;i++){
            if(a>=n){  // reset index of array arr when it is beyond 
                a=0;
            }
            brr[i]=arr[a];
            a++;


        }
        
      return brr;  
    }
}

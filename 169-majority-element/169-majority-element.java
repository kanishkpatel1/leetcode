class Solution {
    public int majorityElement(int[] arr) {
        int  count=0;
        int n=arr.length;
        Arrays.sort(arr);
      if(n==1){
          return arr[0];
      }
     for(int i=0;i<n-1;i++){
         if(arr[i]==arr[i+1]){
             count++;
            if(count>=n/2){
                 return arr[i];
             }
        }
         else{
             count=0;
         }
     }
        return 0;
 }
}
        
        
    

class Solution {
    public int[] plusOne(int[] arr) {
         int a=arr.length;
        for(int i=a-1;i>=0;i--){
            if(arr[i]!=9){
                arr[i]++;
                break;
            }
            else{
                arr[i]=0;
            }
        }
        if(arr[0]==0){
            int []brr=new int[a+1];
            brr[0]=1;
            return brr;      
              }
            return arr;
    }
}
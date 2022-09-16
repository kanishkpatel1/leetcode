class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
       boolean arr[]=new boolean[n];
        for(int i=3;i<Math.sqrt(n);i=i+2){
            if(arr[i]==false){
                for(int j=i*i;j<n;j=j+i){  
                    arr[j]=true;
                }
            }
        }
        int count=1;
        for(int i=3;i<n;i+=2){
            if(!arr[i]){
                count++;
            }
        }
        return count;
    }
}
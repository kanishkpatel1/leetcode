class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int ycount[]=new int[n+1];
        int ncount[]=new int[n+1];
        ncount[0]=0;
        ycount[n]=0;
        int count=0;
        // count prefix of N
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='N'){
                count++;
            }
                ncount[i+1]=count;
            
        }
        //  count suffix Y
        count=0;
        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                count++;
               
            }
             ycount[i]=count;
        }
        int indx=0;
         int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
           // at every index of i we will calculate the prefix count of x and suffix count of y and check the minimum of minimum index 
            // because we will have to return the minimum index
            int sum=ncount[i]+ycount[i];
            if(sum<ans){
                indx=i;
                ans=sum;
            }
        }
        return indx;
    }
}
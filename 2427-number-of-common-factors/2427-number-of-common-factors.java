class Solution {
    public int commonFactors(int a, int b) {
        int c=0,count=0;
        if(a<b){
        c=a;
        }
        else{
            c=b;
        }
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}
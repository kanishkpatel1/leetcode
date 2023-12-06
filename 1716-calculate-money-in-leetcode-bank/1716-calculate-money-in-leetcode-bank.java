class Solution {
    public int totalMoney(int n) {
        int counter=1;
        int start=0;
        int res=0;
        while(n>7){
            res+=28;
            res+=start;
            start+=7;
            counter++;
            n-=7;
        }
        System.out.println(res);
        for(int  i=1;i<=n;i++){
            res+=counter++;
        }
        return res;
    }
}
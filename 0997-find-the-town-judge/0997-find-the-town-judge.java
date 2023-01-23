class Solution {
    public int findJudge(int n, int[][] trust) {
           int trusts[]=new int[n+1];
        int trustedby[]=new int[n+1];

        for(int i=0;i<trust.length;i++){
            trusts[trust[i][0]]++;
            trustedby[trust[i][1]]++;
            
        }
        for(int i=1;i<n+1;i++){
            if(trustedby[i]==n-1 && trusts[i]==0){
                return i;
            }
        }
      //  System.out.println(Arrays.toString(trusts));
      //  System.out.println(Arrays.toString(trustedby));
        return -1;
    }
}
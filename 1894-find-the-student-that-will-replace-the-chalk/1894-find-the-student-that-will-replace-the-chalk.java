class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i=0;i<chalk.length;i++) sum+=chalk[i];
        long m=(long)k;
        long rr=m%sum;
        int r=(int)rr;
        for(int i=0;i<chalk.length;i++){

            if(r<chalk[i]) return i;
            else{
                r-=chalk[i];
            }
        }
        return -1;
    }
}
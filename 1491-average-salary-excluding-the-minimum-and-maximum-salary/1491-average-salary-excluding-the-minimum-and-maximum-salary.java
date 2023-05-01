class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double ans=0;
        for(int i=1;i<salary.length-1;i++){
            ans+=salary[i];
           // System.out.println(ans);
        }
        return ans/(salary.length-2);
    }
}
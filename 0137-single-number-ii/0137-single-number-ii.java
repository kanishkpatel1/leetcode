class Solution {
    public int singleNumber(int[] arr) {
        int ones=0;
        int twos=0;
        for(int i=0;i<arr.length;i++){
            int el=arr[i];
            ones=(ones^el)&(~twos);
            twos=(twos^el)&(~ones);
        }
        
        return ones;
    }
}
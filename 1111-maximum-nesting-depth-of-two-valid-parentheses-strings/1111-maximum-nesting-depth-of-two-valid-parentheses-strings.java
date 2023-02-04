class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count=0;
        int res[]=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                res[i]=count%2;
                count++;
            }
            else{
                count--;
                res[i]=count%2;
            }
        }
        return res;
    }
}
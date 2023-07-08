class Solution {
    public long putMarbles(int[] weights, int k) {
        List<Integer>ls=new ArrayList<>();
        for(int i=1;i<weights.length;i++){
            ls.add(weights[i-1]+weights[i]);
        }
        Collections.sort(ls);
        long leftsum=0;
        long rightsum=0;
        for(int i=0;i<k-1;i++){
            leftsum+=ls.get(i);
            rightsum+=ls.get(ls.size()-1-i);
        }
        return rightsum-leftsum;
    }
}
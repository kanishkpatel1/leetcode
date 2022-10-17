class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int as=coordinates[1][0]-coordinates[0][0];
        int bs=coordinates[1][1]-coordinates[0][1];
        for(int i=2;i<coordinates.length;i++){
            int cs=coordinates[i][0]-coordinates[i-1][0];
            int ds=coordinates[i][1]-coordinates[i-1][1];
            if(bs*cs!=as*ds){
                return false;
            }
        }
        return true;
    }
}
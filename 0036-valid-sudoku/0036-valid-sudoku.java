class Solution {
    public boolean isValidSudoku(char[][] board) {
          HashSet<String> hs=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    char number=board[i][j];
                    if(!hs.add(number+"in row"+i)||!hs.add(number+"in column"+j)||!hs.add(number+"in block"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
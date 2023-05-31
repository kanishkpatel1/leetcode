class Solution {
    public static int totalNQueens(int n) {
         List<List<String>>ans=new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]='.';
            }
        }
        queenTry(ans,arr,0,n);
        return ans.size(); // only it is the difference we need to return the size of the array list
    }
     static void queenTry(List<List<String>>ans,char[][] arr,int row,int n){
        if(row==arr.length){
            ans.add(construct(arr)); // construct method
            return;
        }
        
        for(int col=0; col<arr.length;col++){
            if(safe(arr,col,n,row)){     // safe method
                arr[row][col]='Q';
                queenTry(ans, arr, row+1, n);
                arr[row][col]='.';
            }   
        }
    }
   static boolean safe(char arr[][],int col,int n,int row){
    for(int i=0;i<n;i++){
        if(arr[row][i]=='Q' || arr[i][col]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(arr[i][j]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
        if(arr[i][j]=='Q'){
            return false;
        }
    }
    return true;
    }

    static List<String> construct(char[][] arr){
        List<String> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            
            String s=new String(arr[i]);
            //System.out.println(s);
            res.add(s);
        }
        return res;
    }
}
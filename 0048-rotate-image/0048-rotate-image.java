class Solution {
    public void rotate(int[][] a) {
          int n=a.length;
  n--;
         for(int i=0;i<a.length;i++){  // first we transppose the matrix 
    for(int j=i;j<a.length;j++){
      int temp=a[i][j];
      a[i][j]=a[j][i];
      a[j][i]=temp;

    }
  }
  for(int i=0;i<a.length;i++){// then change the position of the columns;
    for(int j=0;j<a.length/2;j++){
      int at=a[i][j];
      a[i][j]=a[i][n-j];
      a[i][n-j]=at;
    }
  } 
    }
}
class Solution {
    public int xorOperation(int n, int start) {
        int b=0;
      while(n>0){
          b=b^start;
          start=start+2;
          n--;
          
      }
        return b;
    }
}
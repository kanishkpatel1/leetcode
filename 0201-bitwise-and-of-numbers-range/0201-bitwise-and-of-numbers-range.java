// left shift m and n while they both are not equal and make a counter 
// and again right shift these 

// Ex-
// m=16--> 1 0 0  0 0
// n=19--> 1 0 0  1 1
// ---------------------
//         1 0 0  0 0
// matched will be same and rest of are zeroes so to find matched we will left shift while not matched
// and make a counter and in next step to add zeroes we will right shift it counter times to add zeroes
//
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
      int count=0;
        while(m!=n){
        m=m>>1;
        n=n>>1;
            
         count++;   
        }
        m=m<<count;
        return m;
    }
}
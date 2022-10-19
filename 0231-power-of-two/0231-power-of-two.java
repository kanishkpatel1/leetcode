class Solution {
    public boolean isPowerOfTwo(int num) {
                // bitwise and of num and num-1 is always zero 
        //if the number is in power of 2
  if(num==0 || num<0 ){
      return false;
  }      
if((num&num-1)==0){
    return true;
}
        return false;
    }
}
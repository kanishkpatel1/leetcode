class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0)
        return false;
    if (n % 4 == 0)
        return isPowerOfFour(n/4);  //call the function again
    if (n == 1){
        return true;
    }
    return false; 
    }
}
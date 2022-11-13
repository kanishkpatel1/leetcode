public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++){
            rev <<=1; 
            rev |=(n&1);  //append the last with in the rev
            //(get the last bit with binary and )
            // append it with binary in the rev variable
            n>>=1;  // remove the last bit from the number 
            
        }
       return rev; 
    }
}
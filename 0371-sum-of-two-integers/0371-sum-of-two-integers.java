class Solution {
    public int getSum(int a, int b) {
        while(b!=0){  // we use while loop for carry until becomes zero
            
            int carry=a&b;   // generate carry
            a^=b;  // it will perform sum
            b=carry<<1;          // add until the carry becomes zero   (shifting the carry)
        }
        return a;
    }
}
class Solution {
    public static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
    
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        String stra=str1+str2;
        String strb=str2+str1;
        
        if(!stra.equals(strb)){
            return "";
        }
        else {
            int a=gcd(l1,l2);
            return str1.substring(0,a);
        }
    }
}
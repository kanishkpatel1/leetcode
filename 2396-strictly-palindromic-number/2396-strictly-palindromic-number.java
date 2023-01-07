// class Solution {
//     public boolean isStrictlyPalindromic(int n) {
//         return false;
//     }
// }

// only return false will also work for this code

class Solution {
    public boolean isStrictlyPalindromic(int n) {
 
         for (int j = 2; j <= n - 2; j++) {
		   String str = Integer.toString(n, j);   // for converting the number n to the base i 

		   int i = 0, length = str.length() - 1;
		   while (i <= length / 2) {
			   if (str.charAt(i) != str.charAt(length)) {
				   return false;
			   }
			   i++;
			   length--;
		   }
	   }
		return true;
    }
    
    
}
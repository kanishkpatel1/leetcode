//approach -->
// make a function and check for both true and false and find max of them which is max return it
// while loop until j reaches the length of the string
// In first condition check if the current digit is equal the desired character increase the counter of j
// in another condition if curr char does not match with the desired character decrease the value of k and increase the j counter

// in another case if value of k is zero then increase the i  while we reached the unmatched character and then increase the value of k because we removed the unmatched character from window 

class Solution {
     public static int solve(String a, int k, char c) {
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < a.length()) {
            if (a.charAt(j) == c) {
                j++;
            } 
            else if (k-- > 0) {
                j++;
            } 
            else {
                while (i <= j) {
                    if (a.charAt(i) != c) {
                        i++;
                        k++;
                        break;
                    }
                    i++;
                }
                j++;
                            }
            ans = Math.max(ans, j - i);
        }

        return ans;
    }

    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int tr = solve(answerKey, k, 'T'); // find max length for true
        int fal = solve(answerKey, k, 'F'); // find max length for false
        return Math.max(tr, fal);
    }
}
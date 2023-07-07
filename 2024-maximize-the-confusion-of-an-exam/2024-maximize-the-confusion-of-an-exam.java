class Solution {
     public static int solve(String a, int k, char c) {
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < a.length()) {
            if (a.charAt(j) == c) {
                j++;
            } else if (k-- > 0) {
                j++;
            } else {
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
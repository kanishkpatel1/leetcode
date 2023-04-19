class Solution {
     public static int addMinimum(String word) {
        int i = 0;
        int sum = 0;
        while (i < word.length()) {
            if (i < word.length() && word.charAt(i) == 'a') {
                i++;
            } else {
                sum++;
            }
            if (i < word.length() && word.charAt(i) == 'b') {
                i++;
            } else {
                sum++;
            }
            if (i < word.length() && word.charAt(i) == 'c') {
                i++;
            } else {
                sum++;
            }

        }
        return sum;
    }
}
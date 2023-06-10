class Solution {
public static String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            s = countAndSayHelper(s);// will give output of itself again and again
        }
        return s;
    }

    public static String countAndSayHelper(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 1;
        char previous = s.charAt(0);
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) != s.charAt(j - 1)) {
                sb.append(c); // add count
                sb.append(previous); // add previous number that not matched with current character
                previous = s.charAt(j); // set the value of previous character
                c = 1; // reset the count
            } else {
                c++; // if matched then increase count
            }

        }
        sb.append(c);  // add last count
        sb.append(previous);  // add last previous character
        return sb.toString(); 
    }
}
// class Solution {
//     public int lengthOfLastWord(String s) {
//        String[] str=s.split(" ");
//         return str[str.length-1].length();
//     }
// }

class Solution {
public int lengthOfLastWord(String s) {
String str = s.trim();
return str.length() - (str.lastIndexOf(" ") + 1);
}  // it is faster runtime 0ms
}
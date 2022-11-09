class Solution {
    public String interpret(String str) {
        str=str.replace("()","o");
        str=str.replace("(al)","al");
        return str;
    }
}
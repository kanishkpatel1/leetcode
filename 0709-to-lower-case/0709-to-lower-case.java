class Solution {
    public String toLowerCase(String s) {
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;++i){
            if(ch[i]<='Z' && ch[i]>='A'){
                ch[i]+=32;
            }
        }
        return new String(ch);
    }
}
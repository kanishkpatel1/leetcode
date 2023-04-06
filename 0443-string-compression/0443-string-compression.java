class Solution {
    public int compress(char[] chars) {
        if(chars.length<=1){
            return 1;
        }
        String str="";
        str+=chars[0];
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){
                if(count!=1){
                str+=count;}
                str+=chars[i];
                count=1;
            }
            else{
                count++;
            }
        }
        if(count!=1){
         str+=count;
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
       
        System.out.println(str);
        System.out.println(str.length());
        return str.length();
    }
}
class Solution {
    public int myAtoi(String s) {
       s=s.trim();
        System.out.println(s);
        if(s.length()==0){
            return 0;
        }
        long res=0;
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           if(i==0 && (ch[i]=='+'|| ch[i]=='-')){
               continue; 
           }
            else if(ch[i]==' '){
                break;
            }
            else if(ch[i]<'0' || ch[i]>'9'){
                break;
            }
            else{
                if(res<-2147483648|| res>2147483647){
                    break;
                }
                res=res*10+ch[i]-'0';
            }
          
           
        }  
             if(ch[0]=='-'){
                res=res*-1;

            }
            if(res>2147483647){
                return 2147483647;
            }
            else if(res<-2147483648){
                return -2147483648;
            }
            else {
                return (int)res;
            }
    }

}
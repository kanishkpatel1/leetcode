class Solution {
    public int myAtoi(String s) {
       s=s.trim();  // remove trailing spaces
        System.out.println(s);
        if(s.length()==0){  // check the base case
            return 0;
        }
        long res=0;
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           if(i==0 && (ch[i]=='+'|| ch[i]=='-')){  // if the first digit is negative or positive then continue
               continue; 
           }
            else if(ch[i]==' '){
        // if there is any space inside digits so break the loop return previous calculated answer
                break;
            }
            // break the loop if any other character's find
            else if(ch[i]<'0' || ch[i]>'9'){
                break;
            }
            else{
                if(res<-2147483648|| res>2147483647){ // check for the max and min value of integer's
                    break;
                }
                res=res*10+ch[i]-'0';
            }
          
           
        }  
             if(ch[0]=='-'){  // if first char of string is negative so we'll have to return negative ans 
                res=res*-1;

            }
        // check for min and max value
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
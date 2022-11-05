
class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            // cheacking weather the char is not a  vowel and  from starting position and i<j
            while(i<j && !(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
            c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')){
                i++;
            }
               // cheacking weather the char is not a vowel and  from end position
                while(i<j && !(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'||
            c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')){
                j--;
            }

            if(i>=j){
                break;
            }
            // if i<j and char is vowel then swap 
            // now swap after checking all conditions
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}

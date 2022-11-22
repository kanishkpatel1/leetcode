class Solution {
  public static boolean isVowel(char c){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'){
            return true;
        }
        return false;
    }

public boolean halvesAreAlike(String s) {
        int n=s.length();
        String str1=s.substring(0,n/2);
        String str2=s.substring(n/2);
        int a=0;
        int b=0;
        for(int i=0;i<str1.length();i++){
            if(isVowel(str1.charAt(i))){
                a++;
            }
        }
        for(int i=0;i<str2.length();i++){
            if(isVowel(str2.charAt(i))){
                b++;
            }
        }
        if(a==b){
            return true;
        }
        return false;
    }
}
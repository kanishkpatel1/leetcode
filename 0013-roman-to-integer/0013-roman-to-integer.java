class Solution {
    public int romanToInt(String s) {
      int sum = 0;
        char[] chr = s.toCharArray();
        for(int i = chr.length - 1; i >= 0; i--) {
            switch(chr[i]) {
                case 'I':
                    if(i + 1 != chr.length && (chr[i + 1] == 'V' || chr[i + 1] == 'X')){
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(i + 1 !=chr.length&&(chr[i + 1]=='L'||chr[i + 1] == 'C')){
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if(i + 1 != chr.length && (chr[i + 1] == 'D' || chr[i + 1] == 'M')){
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
        }
}
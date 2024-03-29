class Solution {
    public String intToRoman(int num) {
        
        String str="";
        while(num!=0){
            if(num>=1000){
                str+="M";
                num-=1000;
            }
            else if(num>=900){
                str+="CM";
                num-=900;
            }
            else if(num>=500){
                str+="D";
                num-=500;
            }
            else if(num>=400){
                str+="CD";
                num-=400;
            }
            else if(num>=100){
                num-=100;
                str+="C";
            }
            else if(num>=90){
                num-=90;
                str+="XC";
                
            }
            else if(num>=50){
                num-=50;
                str+="L";
                
            }
            
            else if(num>=40){
                str+="XL";
                num-=40;
            }
             else if(num>=10){
                str+="X";
                num-=10;
            }
            else if(num>=9){
                str+="IX";
                num-=9;
            }
            else if(num>=5){
                str+="V";
                num-=5;
            }
            else if(num>=4){
                str+="IV";
                num-=4;
            }
            else if(num>=1){
                str+="I";
                num-=1;
            }
            
        }
        
        return str;
    }
}
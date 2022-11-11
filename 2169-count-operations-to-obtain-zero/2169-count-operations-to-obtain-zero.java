class Solution {

    public int countOperations(int num1, int num2) {
        int a1=Math.max(num1,num2);
        int a2=Math.min(num1,num2);
        int stps=0;
        while(a1!=0 && a2!=0){
            stps+=a1/a2;
            a1=a1%a2;
            if(a1<a2){
                int temp=a1;
                a1=a2;
                a2=temp;
                
                
            }
        }
        return stps;
    }
}

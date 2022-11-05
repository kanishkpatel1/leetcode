class Solution {
    public int minimumSum(int n) {
    int []arr=new int[4];
    int i=0;
    while(n!=0){
        arr[i]=n%10;
        n/=10;
        i++;
    }
    Arrays.sort(arr);
    int a=arr[3]+10*arr[0];
    int b=arr[2]+10*arr[1];
    return a+b;
    }
}

// 2^30 equals to 10^9 
// store the frequency of each element of n 
// and then go from 1 to 10^9 with power of 2 and check the frequency matches then return true

class Solution {
    public boolean reorderedPowerOf2(int n) {
        int arr1[]=findfreq(n); // we will get the freq of n 
       int num=1;
        for(int i=1;i<31;i++){ // because we will take step of power 2 that's why loop till 30 for 10^9
            int arr2[]=findfreq(num);
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            num<<=1;
        }
        return false;
    }
    public  int[] findfreq(int n){
        int freq[]=new int[10];
        while(n!=0){
            int ld=n%10;
            freq[ld]++;
            n/=10;
        }
        return freq;
    }
}
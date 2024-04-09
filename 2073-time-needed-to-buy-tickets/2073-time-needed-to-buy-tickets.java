class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int time=0;
        while(true){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    time++;
                    arr[i]--;
                    
                }
                if(i==k && arr[i]==0){
                    return time;
                }
            }
        }
        
    }
}
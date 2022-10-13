
//  class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
        
//     }
// }

class Solution{
    public int[] sortedSquares(int[] nums){
        int n=nums.length;
        int ar[]=new int[nums.length];
        int mid=n;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                mid=i;
                break;
            }
        }
int j=0,a=mid,b=mid-1;;
while(a<n ||b>=0){
    if(a>n-1){
        ar[j]=nums[b]*nums[b];
        j++;
        b--;
    }
    else if(b<0){
        ar[j]=nums[a]*nums[a];
        j++;
        a++;
    }
    else{
        if(Math.abs(nums[a])>Math.abs(nums[b])){
            ar[j]=nums[b]*nums[b];
            j++;
            b--;
        }
        else{
            ar[j]=nums[a]*nums[a];
            j++;
            a++;
        }
    }
}
return ar;
               }
               }
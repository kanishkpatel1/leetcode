class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
Arrays.sort(nums);
int n=nums.length;       
int arr=nums[0];
int count=0;
for(int i=0;i<n;i++){
    if(nums[i]==arr){
        count++;
        if(count>n/3){
            l1.add(nums[i]);
            while(i<n-1 && nums[i]==nums[i+1]){
                i++;
            }
        }
    }else{
        count=1;
        arr=nums[i];
        if(count>n/3){
            l1.add(arr);
        }
    }
}
    return l1;    
    }
}

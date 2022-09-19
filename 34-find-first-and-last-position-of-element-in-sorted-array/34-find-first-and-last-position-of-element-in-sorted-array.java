class Solution {
    public int[] searchRange(int[] nums, int target) {
    ArrayList<Integer> l=new ArrayList<>();
for(int i=0;i<nums.length;i++){
if(nums[i]==target){
l.add(i);
}
}
if(l.size()>0){
int[] res=new int[2];
res[0]=l.get(0);
res[1]=l.get(l.size()-1);
return res;
}
else{
return new int[]{-1,-1};
}
    }
}
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int currheight=0;
        int maxheight=0;
        int end=height.length-1;
        while(start<end){
            currheight=(end-start)*Math.min(height[start],height[end]);
            maxheight=Math.max(maxheight,currheight);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxheight;
    }
}
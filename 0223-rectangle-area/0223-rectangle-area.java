class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=(ax2-ax1)*(ay2-ay1); // area of rectangle 1
        int area2=(bx2-bx1)*(by2-by1);   // area of rectangle 2
        // now we calculate overlap area 
        
        int left=Math.max(bx1,ax1);
        int right=Math.min(ax2,bx2);
        
        int top=Math.min(ay2,by2);
        int bottom=Math.max(by1,ay1);
        int overlap=0;
        if(right>left && top>bottom){
            overlap=(top-bottom)*(right-left);
        }
        return area1+area2-overlap;
    }
}
// class Solution {
//     public int longestString(int x, int y, int z) {
//         int a=z*2;
//         if(x>y) a+=2*y+(y+1)*2;
//         else if(y>x) a+=2*x+(x+1)*2;
//         else a+=4*x;
//         return a;
//     }
// }

class Solution {
    public int longestString(int x, int y, int z) {
        int u=Math.min(x,y);
        return (x==y)?((z+2*u)*2):((1+z+2*u)*2);
    }
}
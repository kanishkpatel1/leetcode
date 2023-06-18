// class Solution {
//      public static int distanceTraveled(int m, int a) {
//         int d=0,tf=0;

//         while(m>=5){
//             tf+=5;
//             m=m-5;
//             if(a>0){
//                 m++;
//                 a--;
//             }
//         }
//         tf+=m;
//         return tf*10;
//     }

// }

// TC-> O(1)
// SC-> O(1)
class Solution {
     public static int distanceTraveled(int m, int a) {
         
         return (m+Math.min((m-1)/4,a))*10;
}
}
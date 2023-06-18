// class Solution {
// public:
//     int distanceTraveled(int mainTank, int additionalTank) {
//         int distance=0;
//         int total_fuel=0;
//         while(mainTank>=5){
//             mainTank=mainTank+(mainTank-5);
//             if(additionalTank>0){
//                 mainTank++;
//                 additionalTank--;
//             }
//         }
//         total_fuel+=mainTank;
//         return total_fuel;
//     }
// };

//TC-> O(1)
// SC-> O(1)
class Solution {
public:
     int distanceTraveled(int mainTank, int additionalTank) {
        return (mainTank+min((mainTank-1)/4,additionalTank))*10;
    }
};
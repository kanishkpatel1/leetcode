// see for first index of l[0] and r[0] and try to figure out how true or false will come
// create a temp array from index l[0] to r[0] then check the difference of two consecutives if difference same add true else add false
// take values for temp[l[i]-r[i]+1]
// for 0th query values in temp are [4,6,5] 
// in next step sort them --> [4,5,6]
// then the difference between two consecutives should be same if it not then add false in the array list


class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ls=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int ind=0;
            int temp[]=new int[r[i]-l[i]+1];   // create a temp array of length  as per the conditions of question for every index of l[i] and r[i] 
            for(int j=l[i];j<=r[i];j++){
                temp[ind++]=nums[j];
            }
            ls.add(check(temp));
        }
        return ls;
    }
    
     // it is our helper function to check the differnce of two consecutive values in the array
    public boolean check(int temp[]){
        Arrays.sort(temp);  // we will have to sort in and then check the difference after sorting the difference of two elements must be same 
        // otherwise return false
        if(temp.length<=2){  // because diff of two element is only one so it's true and if there is only one ele in array temp then also it  is true
            return true;
        }
        int diff=temp[1]-temp[0];   // take the difference of first two values
        for(int i=1;i<temp.length;i++){
       if(diff!=temp[i]-temp[i-1]){ // at any point the difference of two consecutives and diff doest not same then return false otherwise return true
           return false;
            }
        }
        return true;
        
    }
}
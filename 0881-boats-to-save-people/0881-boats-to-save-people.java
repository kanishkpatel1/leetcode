class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length-1;
        int left=0;
        int right=n;
        Arrays.sort(people);
        while(left<=right){
            if((people[left]+people[right])<=limit){
                left++;
                right--;
                count++;
            }
            else{
                right--;
                count++;
            }
        }
        return count;
    }
}
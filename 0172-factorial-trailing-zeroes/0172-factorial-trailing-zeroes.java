class Solution {
    public int trailingZeroes(int fact) {
        int count=0;
        while(fact>=5){   
            // because if we multiply 2 with 5 then we get one zero so
            //count the 5
            fact=fact/5;
            count+=fact;

        }
        return count;
    }
}
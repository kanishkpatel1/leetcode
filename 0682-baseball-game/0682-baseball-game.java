class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int a = stk.pop();
                int b = a + stk.peek();
                stk.push(a);
                stk.push(b);
            }
            else if (s.equals("D")) {
                stk.push(2 * stk.peek());
            }
            else if (s.equals("C")) {
                stk.pop();
            }
            else stk.push(Integer.parseInt(s));
        }

        int sum = 0;
        while (!stk.isEmpty()){
            sum += stk.pop();
        }

        return sum;
    }
}
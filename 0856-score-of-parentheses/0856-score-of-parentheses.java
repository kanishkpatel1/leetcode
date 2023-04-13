// There are some testcase that should be in the example
// 1.    (()())  
//       (1  1)=> (2)=> 2*2=4 so the ans is 4

// 2.  (()())()
//     (1 1)()
//      (2)()
//       4+1=> 5 so the ans is 5

//3.     (()(()))
//       (1(1))
//       (1 2*1)
//        (3)   => 3*2= 6 so the ans is 6 

// So considering these test cases think the solution


             

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(-1);
            }
            else{
               if(stk.peek()==-1){
                   stk.pop();
                   stk.push(1);
               }
                else{
                    int sum=0;
                    while(stk.peek()!=-1){  // because string is balanced so in every testcase it will not empty untill it find -1
                        sum+=stk.pop();
                        
                    }
                    stk.pop();  // remove the -1 alse from the stack 
                    stk.push(2*sum);  // according to third conditon we will have to double the sum and then add it again in the stack
                }
              }
            }
        
        // if some values are stored in the stack then check again
        int sum=0;
        while(stk.size()>0){
            sum+=stk.pop();
        }
        return sum;
        }
    }

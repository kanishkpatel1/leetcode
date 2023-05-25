class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
 //       int count=0;

//         List<Integer> ls1=new ArrayList<>();  // student arraylist
//         List<Integer> ls2=new ArrayList<>();   // sandwich array list
//         for(int i=0;i<students.length;i++){ 
//             ls1.add(students[i]);
//         }
//         for(int i=0;i<sandwiches.length;i++){
//             ls2.add(sandwiches[i]);
//         }
//         int i=0;

//         while(ls2.size()!=0){
//             if(ls1.get(i)isEquals(ls2.get(i))){
//                 ls1.remove(i);
//                 ls2.remove(i);
//             }
//             else{
//                 count++;
//                 ls1.add(ls1.get(i));
//                 ls1.remove(i);
//             }
//             if(count==ls1.size()){
//                 return count;
//             }
//         }

//         return count;
        
      int count=0;

       Queue<Integer> student=new LinkedList<>();
       Stack<Integer> stk=new Stack<>();

       // students queue
       for(int i=0;i<sandwiches.length;i++){
        student.offer(students[i]);
    }

       // sandwich stack
        for(int i=students.length-1;i>=0;i--){ 
            stk.push(sandwiches[i]);
        }
     
        int i=0;

        while(true){
            int st=student.poll();
            if(st==stk.peek()){
                stk.pop();
                count=0;  // if there are any students already so make counter zero
            }
            else{
                count++;
                student.offer(st);
             }
            if(count==student.size()){
                return count;
            }
        }     
        
    }
}
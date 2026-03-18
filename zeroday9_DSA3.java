// //implement a stack using arraylist
// import java.util.ArrayList; 
// public class zeroday9_DSA3 {
//     static class Stack{
//         ArrayList<Integer> list = new ArrayList<>();

//         public void push(int data){
//             list.add(data);
//         }

//         public int pop(){
//             if(list.size() == 0){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         public int peek(){
//             if(list.size() == 0){
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }

//         public boolean isEmpty(){
//             return list.size() == 0;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println(s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.peek());
//     }
// }

import java.util.ArrayList;

public class zeroday9_DSA3 {
    static class stack{
        ArrayList<Integer>list=new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int size(){
            return list.size();
        }
        public int pop(){
            if(isEmpty()) return -1;
            int temp=list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(2);
        st.push(3);
        st.push(8);
        st.push(20);
        while(!st.isEmpty()){
            System.out.println(st.peek()+"  ");
            st.pop();
        }
    }
}
//sort a stack without using recursion
// import java.util.Stack;
// public class zeroday10_DSA2 {
//     public static void sortStack(Stack<Integer>s){
//         Stack<Integer> tempStack = new Stack<>();
//         while(!s.isEmpty()){
//             int temp=s.pop();
//             while(!tempStack.isEmpty() && tempStack.peek()>temp){
//                 s.push(tempStack.pop());
//             }
//             tempStack.push(temp);
//         }
//         while(!tempStack.isEmpty()){
//             s.push(tempStack.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(3);
//         s.push(1);
//         s.push(4);
//         s.push(2);
//         sortStack(s);
//         while(!s.isEmpty()){
//             System.out.print(s.pop()+" ");
//         }
//     }
// }
//SORT A STACK USING INSERTION SORT
import java.util.Stack;
public class zeroday10_DSA2 {
    public static void insertSorted(Stack<Integer>s,int temp){
        if(s.isEmpty() || s.peek()<=temp){
            s.push(temp);
            return;
        }
        int top=s.pop();
        insertSorted(s,temp);
        s.push(top);
    }
    public static void sortStack(Stack<Integer>s){
        if(!s.isEmpty()){
            int temp=s.pop();
            sortStack(s);
            insertSorted(s,temp);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        sortStack(s);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
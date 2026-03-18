//write a java program which will check whether the given stack is palindrome or not
import java.util.Stack;
public class zeroday10_DSA1 {
    public static boolean isPalindrome(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        int size = stack.size();
        
        for (int i = 0; i < size; i++) {
            int element = stack.pop();
            tempStack.push(element);
        }
        
        for (int i = 0; i < size; i++) {
            stack.push(tempStack.pop());
        }
        
        for (int i = 0; i < size; i++) {
            if (stack.pop() != tempStack.pop()) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Is palindrome: " + isPalindrome(stack));
    }
}
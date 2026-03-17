//write a program to reverse a linked list to check whether the linked list is palindrome or not
public class zeroday9_DSA1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    void insert_end(int data){
        Node new_node= new Node(data);
        if(head==null){
            head= new_node;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new_node;  
    }
    void reverse(){
        Node prev=null,current=head,next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head,fast=head,prev_slow=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev_slow=slow;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        prev_slow.next=null;
        reverse();
        Node first_half=head,second_half=slow;
        while(first_half!=null && second_half!=null){
            if(first_half.data!=second_half.data){
                return false;
            }
            first_half=first_half.next;
            second_half=second_half.next;
        }
        return true;
    }
    public static void main(String[] args) {
        zeroday9_DSA1 list= new zeroday9_DSA1();
        list.insert_end(10);
        list.insert_end(20);
        list.insert_end(30);
        list.insert_end(20);
        list.insert_end(10);
        if(list.isPalindrome()){
            System.out.println("the linked list is palindrome");
        }else{
            System.out.println("the linked list is not palindrome");
        }
    }
}
// public class zeroday9_DSA1 {
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     Node head;

//     void insert_end(int data) {
//         Node new_node = new Node(data);
//         if (head == null) {
//             head = new_node;
//             return;
//         }
//         Node current = head;
//         while (current.next != null) {
//             current = current.next;
//         }
//         current.next = new_node;
//     }

//     // Reverse from given node
//     Node reverse(Node node) {
//         Node prev = null, current = node, next = null;
//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         return prev;
//     }

//     boolean isPalindrome() {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         Node slow = head, fast = head, prev_slow = null;

//         // Find middle
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             prev_slow = slow;
//             slow = slow.next;
//         }

//         // Handle odd length
//         if (fast != null) {
//             slow = slow.next;
//         }

//         // Split list
//         prev_slow.next = null;

//         // Reverse second half
//         Node second_half = reverse(slow);
//         Node first_half = head;

//         // Compare
//         while (first_half != null && second_half != null) {
//             if (first_half.data != second_half.data) {
//                 return false;
//             }
//             first_half = first_half.next;
//             second_half = second_half.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         zeroday9_DSA1 list = new zeroday9_DSA1();
//         list.insert_end(10);
//         list.insert_end(20);
//         list.insert_end(30);
//         list.insert_end(20);
//         list.insert_end(10);

//         if (list.isPalindrome()) {
//             System.out.println("The linked list is palindrome");
//         } else {
//             System.out.println("The linked list is not palindrome");
//         }
//     }
// }

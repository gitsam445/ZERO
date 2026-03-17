//find the middle element of the linked list
public class zeroday9_DSA {
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
    void find_middle(){
        if(head==null){
            System.out.println("the linked list is empty");
            return;
        }
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("the middle element of the linked list is: "+slow.data);
    }
    public static void main(String[] args) {
        zeroday9_DSA list= new zeroday9_DSA();
        list.insert_end(10);
        list.insert_end(20);
        list.insert_end(30);
        list.insert_end(40);
        list.insert_end(50);
        list.find_middle();
    }
}
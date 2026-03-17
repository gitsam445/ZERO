//adding a node in the middle of the linked list
public class zeroday8_DSA3 {
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
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    public static void main(String[] args) {
        zeroday8_DSA3 list= new zeroday8_DSA3();
        list.insert_end(10);
        list.insert_end(20);
        list.insert_end(30);
        Node current=list.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}

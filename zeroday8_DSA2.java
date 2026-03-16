//adding elements at the beggining of the linked list
public class zeroday8_DSA2 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    void insert_at_start(int data){
        Node new_node= new Node(data);
        if(head==null){
            head= new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public static void main(String[] args) {
        zeroday8_DSA2 list= new zeroday8_DSA2();
        list.insert_at_start(10);
        list.insert_at_start(20);
        list.insert_at_start(30);
        Node current=list.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}

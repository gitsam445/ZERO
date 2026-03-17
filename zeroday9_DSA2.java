//WAP WHICH WILL PRINT INTERSECTION OF TWO LINKED LISTS
public class zeroday9_DSA2 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head1,head2;
    void insert_end(Node head,int data){
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
    void find_intersection(){
        if(head1==null || head2==null){
            System.out.println("one of the linked list is empty");
            return;
        }
        Node current1=head1,current2=head2;
        while(current1!=null && current2!=null){
            if(current1.data==current2.data){
                System.out.print(current1.data+" ");
                current1=current1.next;
                current2=current2.next;
            }else if(current1.data<current2.data){
                current1=current1.next;
            }else{
                current2=current2.next;
            }
        }
    }
    public static void main(String[] args) {
        zeroday9_DSA2 list= new zeroday9_DSA2();
        list.insert_end(list.head1,10);
        list.insert_end(list.head1,20);
        list.insert_end(list.head1,30);
        list.insert_end(list.head2,20);
        list.insert_end(list.head2,30);
        list.insert_end(list.head2,40);
        System.out.println("the intersection of the two linked lists is: ");
        list.find_intersection();
    }
}

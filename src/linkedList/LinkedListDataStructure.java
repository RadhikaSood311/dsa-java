package linkedList;
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;


        }
        System.out.println();
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void deleteAtHead() {
        if(head==null){
            System.out.println("List Is Empty");
            return;
        }

        head = head.next;
        if(head==null) tail=null;
        size--;
    }
    void get(int indx){
        Node temp=head;
        for(int i=0;i<indx;i++){
            temp=temp.next;
        }
        System.out.println(temp.val);
        return;

    }
    void insert(int indx,int val){
        Node temp = new Node(val);
        if(indx>size || indx<0) System.out.println("invalid indx");
        else if(indx==0) addAtHead(val);
        else if(indx==size) addAtTail(val);
        Node a = head;
        for(int i=0;i<indx-1;i++) {
            a=a.next;
        }
        temp.next=a.next;
        a.next=temp;
        size++;

    }
    void delete(int indx){
        if(indx<0 || indx>=size) {
            System.out.println("Not Possible");
            return;
        }
        if(indx==0) deleteAtHead();
        Node temp = head;
        for(int i=0;i<indx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if (indx==size-1 ) tail = temp;
        size--;
    }

}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(1);
        ll.addAtTail(3);
        ll.addAtTail(5);
        ll.addAtTail(7);
//        ll.display();
//        ll.addAtHead(64);
//        ll.display();
//        ll.deleteAtHead();
//        ll.display();
//        System.out.println(ll.size);
//        ll.get(2);
//        ll.insert(2,102);
        ll.display();
        ll.delete(2);
        ll.display();


    }
}

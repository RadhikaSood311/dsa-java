package linkedList;

public class CircularLL {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(309);
        Node d = new Node(403);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        Node head=a;
        Node temp=head;
        Node tail=e;
        while(temp.next!=head){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);


    }
}

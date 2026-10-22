package linkedList;

public class DisplayList {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;

        }
        System.out.println();

    }
    public static void rec(Node head){
        if(head==null) return ;
        rec(head.next);
        System.out.println(head.val);
    }
    public static int get(Node head,int indx){
        Node temp=head;
         for(int i=0;i<indx;i++){
             temp=temp.next;
         }
         return temp.val;

    }

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
//        display(a);
//        rec(a);
        System.out.println(get(a,0));

    }
}

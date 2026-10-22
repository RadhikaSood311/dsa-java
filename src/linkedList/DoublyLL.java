package linkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==tail) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;

    }
    void deleteAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==tail) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;

    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    void rDisplay(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();

    }
    void insert(int val,int indx){
        ListNode n = new ListNode(val);
        ListNode temp=head;
        ListNode temp2=head;
        if(indx==0) insertAtHead(val);
        if(indx==size) insertAtTail(val);
        for(int i=0;i<indx-1;i++){
            temp=temp.next;
        }
        temp2=temp.next;
        temp.next=n;
        n.next=temp2;
        temp2.prev=n;
        n.prev=temp;
        size++;

    }

}


public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
//        list.display();
//        list.rDisplay();
        list.insert(6,2);
        list.display();


    }
}

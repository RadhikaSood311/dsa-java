package linkedList;
import java.util.*;
public class ReverseDoublyLL {
    public static void reverseDLL(ListNode head){
        ListNode back=null;
        ListNode curr=head;
        ListNode forwd=null;
        while(curr!=null){
            forwd=curr.next;
            curr.next=back;
            curr.prev=forwd;
//            back.prev=curr;
            back=curr;
            curr=forwd;

        }
        ListNode temp=back;

        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();


    }
    public static void main(String[] args) {
        DLL rlist = new DLL();
        rlist.insertAtHead(10);
        rlist.insertAtHead(20);
        rlist.insertAtHead(30);
        rlist.insertAtHead(40);
        rlist.insertAtHead(50);
        reverseDLL(rlist.head);
    }
}

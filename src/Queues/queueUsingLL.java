package Queues;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int size;
    void add(int val){
        Node n = new Node(val);
        if(tail==null) head=tail=n;
        else{
            tail.next=n;
            tail=n;
        }
        size++;

    }
    void remove(){
        if(size==0) System.out.println("error");
        int front=head.val;
        head=head.next;
        size--;
        System.out.println(front);
    }
    void peek(){
        if(size==0) System.out.println("error");
        int front=head.val;
        System.out.println(front);

    }
    void display(){
        if(size==0) System.out.println("null");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }



}

public class queueUsingLL {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        q.display();
        q.remove();
        q.display();


    }


}

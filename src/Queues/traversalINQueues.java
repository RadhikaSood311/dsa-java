package Queues;
import java.util.*;

public class traversalINQueues {
    private static void display(Queue<Integer> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.println(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();

    }
    private static void addAtIndex(Queue<Integer> q,int indx,int val){
        int n=q.size();
        for(int i=0;i<indx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-indx;i++){
            q.add(q.remove());
        }
    }
    private static void removeAtIndex(Queue<Integer> q,int indx){
        int n=q.size();
        if(indx==0){
            q.remove();
            return;
        }
        for(int i=0;i<indx-1;i++){
            q.add(q.remove());
        }
        q.remove();
        for(int i=0;i<q.size()-indx;i++){
            q.add(q.remove());
        }

    }
    private static void peekAtIndex(Queue<Integer> q,int indx){
        int n=q.size();
        for(int i=0;i<indx;i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());
        for(int i=0;i<n-indx;i++){
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);
        display(q);
        addAtIndex(q,1,15);
        display(q);
        removeAtIndex(q,0);
        display(q);



    }
}

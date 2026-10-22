package Queues;
class CircularQueue{
    int[] arr;
    int f;int r;int size;
    CircularQueue(int capacity){
        arr=new int[capacity];
    }
    void add(int val){
        if(size==arr.length) System.out.println("Queue is full");
        else{
            arr[r++]=val;
            if(r==arr.length) r=0;
            size++;
        }
    }
    void remove(){
        if(size==0) System.out.println("Queue is Empty");
        else{
            int frontvalue=arr[f];
            f++;
            if(f==arr.length) f=0;
            size--;
            System.out.println(frontvalue);
        }
        System.out.println();

    }
    int peek(){
        if(size==0) return -1;
        return(arr[f]);
    }

    void display(){
        if(r<=f && size>0){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class circularArray {
    public static void main(String[] args) {
        CircularQueue q= new CircularQueue(5);
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        q.display();
        q.remove();
        q.remove();
        q.add(75);
        q.display();
        int[] a = q.arr;
        for(int ele:a) System.out.print(ele+" ");

    }
}

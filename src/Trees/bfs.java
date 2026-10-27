package Trees;
import java.util.*;
class Nodee {
    int val;
    Nodee left;
    Nodee right;
    Nodee(int val){
        this.val=val;
    }
}
public class bfs {
    public static void main(String[] args) {
        Nodee a = new Nodee(1);
        Nodee b = new Nodee(2);
        Nodee c = new Nodee(3);
        Nodee d = new Nodee(4);
        Nodee e = new Nodee(5);
        Nodee f = new Nodee(6);
        Nodee g = new Nodee(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        displayy(a);

    }
    public static void displayy(Nodee root){
        Queue<Nodee> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Nodee front = q.remove();
            System.out.print (front.val);
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();

    }

}

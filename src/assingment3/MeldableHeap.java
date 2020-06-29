package assingment3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Class Node *
 */
class Node {

    Node left, right, parent;
    int x;

    public Node(Node parent, Node left, Node right, int x) {
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.x = x;

    }

    @Override
    public String toString() {
        return "Node{" + "left=" + left + ", right=" + right + ", parent=" + parent + ", x=" + x + '}';
    }

}

/**
 * Class MedlableHeap *
 */
public class MeldableHeap {

    private Random rand;
    private int n;
    private Node root;

    public MeldableHeap() {
        root = null;
        rand = new Random();
        n = 0;
    }

    /**
     * Check if heap is empty *
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * clear heap *
     */
    public void makeEmpty() {
        root = null;
        rand = new Random();
        n = 0;
    }

    /**
     * function to get size *
     */
    public int getSize() {
        return n;
    }

    /**
     * function to insert an element *
     */
    public void add(int x) {
        Node u = new Node(null, null, null, x);
        root = meld(u, root);
        root.parent = null;
        n++;
    }

    /**
     * function to remove an element *
     */
    public int remove() {
        int x = root.x;
        root = meld(root.left, root.right);
        if (root != null) {
            root.parent = null;
        }
        n--;
        return x;
    }

    public int remove(int u) {
        Queue<Integer> q = new LinkedList<>();
        int w = remove();
        if(w != u){
            q.add(w);
        }
        while (!isEmpty()) {
            w = remove();
            if (w != u) {
                q.add(w);
            }
        }
        if (q.isEmpty()) {
            return w;
        }
        root = new Node(null, null, null, q.poll());
        n = 0;
        while (!q.isEmpty()) {
            Node node = new Node(null, null, null, q.poll());
            root = meld(node,root);
        }
        return u;
    }

    /**
     * function to merge two nodes *
     */
    public Node meld(Node q1, Node q2) {
        if (q1 == null) {
            return q2;
        }
        if (q2 == null) {
            return q1;
        }

        if (q2.x < q1.x) {
            return meld(q2, q1);
        }

        if (rand.nextBoolean()) {
            q1.left = meld(q1.left, q2);
            q1.left.parent = q1;
        } else {
            q1.right = meld(q1.right, q2);
            q1.right.parent = q1;
        }
        return q1;
    }

    /**
     * function to print heap *
     */
    public void displayHeap() {
        System.out.print("\nMeldable Heap : ");
        if (root == null) {
            System.out.print("Empty\n");
            return;
        }

        Node prev, w = root;
        while (w.left != null) {
            w = w.left;
        }

        while (w != null) {
            System.out.print(w.x + " ");
            prev = w;
            w = nextNode(w);
        }
        System.out.println();
    }

    /**
     * function to get next node in heap *
     */
    private Node nextNode(Node w) {
        if (w.right != null) {
            w = w.right;
            while (w.left != null) {
                w = w.left;
            }
        } else {
            while (w.parent != null && w.parent.left != w) {
                w = w.parent;
            }
            w = w.parent;
        }
        return w;
    }
}

import java.util.*;
public class PartitonList{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node partitonList(Node head, int k){
        Node less = new Node(-1);
        Node greater = new Node(-1);

        Node t1 = less;
        Node t2 = greater;

        Node curr = head;

        while(curr != null){
            if(curr.data < k){
                t1.next = new Node(curr.data);
                t1 = t1.next;
            }else{
                t2.next = new Node(curr.data);
                t2 = t2.next;
            }
            curr = curr.next;
        }
        
        t1.next = greater.next;

        return less.next;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        Node head = new Node(1);
        Node n1 = new Node(4);
        head.next = n1;
        Node n2 = new Node(3);
        n1.next = n2;
        Node n3 = new Node(2);
        n2.next = n3;
        Node n4 = new Node(5);
        n3.next = n4;
        Node n5 = new Node(2);
        n4.next = n5;
        
        int k = 3;
        head = partitonList(head, k);
        display(head);
    }
}
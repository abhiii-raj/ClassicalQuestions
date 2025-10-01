public class Palindromelist {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrome(Node head){
        Node prev = null;
        Node curr = findMiddle(head);
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            else{
                left = left.next;
                right = right.next;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        Node n1 = new Node(2);
        head.next = n1;
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(1);
        n2.next = n3;

        System.out.println(checkPalindrome(head));
    }
}

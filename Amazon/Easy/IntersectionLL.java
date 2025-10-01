public class IntersectionLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static int findIntersection(Node list1, Node list2){
        Node temp = list1;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = list2;
        Node slow = list1;
        Node fast = list1;

        boolean isCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }

        if(isCycle == false){
            return -1;
        }

        slow = list1;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){

        //first linked list
        Node list1 = new Node(4);
        Node n1 = new Node(1);
        list1.next = n1;
        Node n2 = new Node(8);
        n1.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        Node n4 = new Node(5);
        n3.next = n4;

        //second linked list
        Node list2 = new Node(5);
        Node n5 = new Node(6);
        list2.next = n5;
        Node n6 = new Node(1);
        n5.next = n6;
        n6.next = n2;

        // display(list1);
        // display(list2);
        System.out.println(findIntersection(list1, list2));
    }
}

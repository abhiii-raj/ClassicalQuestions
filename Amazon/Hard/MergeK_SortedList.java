import java.util.*;

public class MergeK_SortedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node mergeList(Node arr[]) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        for (int i = 0; i < arr.length; i++) {
            Node curr = arr[i];

            while (curr != null) {
                temp.next = curr;
                temp = temp.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node leftHead, Node rightHead) {
        Node merge = new Node(-1);
        Node temp = merge;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data < rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }

        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }

        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return merge.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        Node leftHead = mergeSort(head);
        Node rightHead = mergeSort(right);

        Node finalhead = merge(leftHead, rightHead);

        return finalhead;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node mergeKlist(Node arr[]) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.data - b.data);

        for (Node ptr : arr) {
            if (ptr != null) {
                pq.add(ptr);
            }
        }

        Node head = null, tail = null;

        while (!pq.isEmpty()) {
            Node curr = pq.remove();
            if (head == null) {
                head = tail = curr;
            } else {
                tail.next = curr;
                tail = tail.next;
            }

            if (curr.next != null) {
                pq.add(curr.next);
            }
        }
        return head;
    }

    public static void main(String args[]) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(0);
        list2.next = new Node(2);
        list2.next.next = new Node(4);

        Node list3 = new Node(1);
        list3.next = new Node(3);
        list3.next.next = new Node(7);

        // BRUTE-FORCE APPROACH
        Node arr[] = { list1, list2, list3 };
        Node head = mergeList(arr);
        display(head);
        head = mergeSort(head);
        display(head);
        System.out.println();
        // OPTIMAL APPROACH
        head = mergeKlist(arr);
        display(head);
    }
}
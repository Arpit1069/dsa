package _5linkedList;

public class mergeSort {
    public static void main(String[] args) {
        mergeSort ll = new mergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        head = ll.mergesorting(head);
        ll.display();



    }

    private Node merge(Node h1, Node h2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
         while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node mergesorting(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node right = mid.next;
        Node left = head;
        mid.next = null;
        Node newright = mergesorting(right);
        Node newleft = mergesorting(left);

        return merge(newleft, newright);

    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        if (head == null) {
            Node n = new Node(data);
            size++;
            head = tail = n;
        } else {
            Node n = new Node(data);
            size++;
            n.next = head;
            head = n;
        }

    }

    public void addLast(int data) {
        if (head == null) {
            Node n = new Node(data);
            size++;
            head = tail = n;
        } else {
            Node n = new Node(data);
            size++;
            tail.next = n;
            tail = n;
        }

    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node n = new Node(data);
        size++;
        n.next = temp.next;
        temp.next = n;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("null");

    }

}

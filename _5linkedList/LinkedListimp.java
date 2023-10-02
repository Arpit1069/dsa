package _5linkedList;

public class LinkedListimp {
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

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return val;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("null");

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int Rsearch(int key) {
        return helper(head, key);
    }

    public static void search(int key) {
        Node n = head;
        while (n != null) {
            if (n.data == key) {
                System.out.println("key found");
                break;
            } else {
                n = n.next;
            }
        }
        System.out.println("Key not found");
    }

    public void reverse() {
        Node next, curr, prev;
        prev = null;
        curr = head ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedListimp ll = new LinkedListimp();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.add(2, 50);
        ll.display();
        ll.reverse();
        ll.display();
    }

    public void nth(int i) {
    }

}

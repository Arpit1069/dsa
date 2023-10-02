package _5linkedList;

public class reverseLL {
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

    public void reverse(){
        Node next,curr,prev;
        prev = null;
        curr = head ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
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
}

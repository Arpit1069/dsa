package _5linkedList;

public class nthformback {
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
    public void nthremoveback(int index){
        int sz =0;
        Node temp =head;
        while(temp != null){
            temp =temp.next;
            sz++;
        }        
        if(sz == index){
            head = head.next;
        }
        int i=1;
        int k = sz-index;
        Node curr = head;
        while(i<k){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return;
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
        nthformback ll = new nthformback();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.add(2, 50);
        ll.display();
        ll.display();
        ll.nthremoveback(2);
        ll.display();
    }
}

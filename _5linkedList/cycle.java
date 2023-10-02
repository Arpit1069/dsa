package _5linkedList;

public class cycle {
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

    public static boolean iscycle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void remove() {
        Node slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        Node prev = null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next =temp;
        System.out.println(iscycle());
        Node temp2= head;
        remove();
        while (temp2 != null) {
            System.out.print(temp2.data + "->");
            temp2 = temp2.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println(iscycle());
    }
}

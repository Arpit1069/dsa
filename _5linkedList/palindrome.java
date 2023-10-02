package _5linkedList;

public class palindrome {
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

    public int mid() {
        return (size / 2) + 1;
    }

    public Node reverse(Node he) {
        Node next, curr, prev;
        prev = null;
        curr = he;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome() {
        int middle = mid();
        Node temp = head;
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }
        Node reversed = reverse(temp);
        Node temp2 = head;
        while (reversed != null) { // Change the loop condition
            if (temp2.data != reversed.data) {
                return false;
            }
            temp2 = temp2.next;
            reversed = reversed.next;
        }
        return true;
    }
    public boolean isPalindrome2() {
        Node slow = head;
        Node fast = head;
        Node prevSlow = head;
        Node mid = null;
        boolean isPalindrome = true;
    
        if (head != null && head.next != null) {
            // Move 'fast' two steps and 'slow' one step to find the middle of the list
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prevSlow = slow;
                slow = slow.next;
            }
    
            if (fast != null) {
                // The linked list has an odd number of nodes, skip the middle node
                mid = slow;
                slow = slow.next;
            }
    
            // Reverse the second half of the linked list
            Node secondHalf = slow;
            prevSlow.next = null; // Separate the first half from the second half
            Node reversed = reverse(secondHalf);
    
            // Compare the reversed second half with the first half
            Node temp1 = head;
            Node temp2 = reversed;
            while (temp1 != null && temp2 != null) {
                if (temp1.data != temp2.data) {
                    isPalindrome = false;
                    break;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
    
            // Restore the original linked list
            Node secondHalfReversed = reverse(reversed);
            if (mid != null) {
                prevSlow.next = mid;
                mid.next = secondHalfReversed;
            } else {
                prevSlow.next = secondHalfReversed;
            }
        }
    
        return isPalindrome;
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
        palindrome ll = new palindrome();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        boolean isPalindrome = ll.isPalindrome2();
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

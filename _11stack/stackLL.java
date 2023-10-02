package _11stack;
public class stackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static Node head = null;
        public static boolean isempty(){
           return head == null;
        }
        public static void push(int i){
            Node newNode = new  Node(i); 
            if(isempty()){
                 head = newNode;
                 return; 
             }
            
             newNode.next = head;
             head = newNode;
        } 
        public static int  pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            int top = head.data; 
            return top;
        }
        public static void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30); 
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());

    }

}

package _12queue;

public class queueLL {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
        
           
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isempty(){
            return head == null && tail == null;
         }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = tail =newNode;
                return; 
            }
            tail.next = newNode;
            tail = newNode;

        } 

        public static void remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return; 
            }
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
        } 
        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1; 
            }
            return head.data;
        }
    }
}

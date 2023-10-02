package _12queue;

public class circularqueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            } else {
                if(front == -1){
                    front = 0; 
                }
                rear = (rear+1)%size;
                arr[rear] = data;
            }

        }
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } 
            int val = arr[front];
            if(rear == front){
                rear = front  = -1;
            }else{front = (front+1)%size ;}
            
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front]; 
        }

    }
 
}

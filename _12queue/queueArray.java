package _12queue;

public class queueArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        for (int x : q.arr){
            System.out.print(x + " ");
        }
        System.out.println();
        q.remove2();
        for (int x : q.arr){
            System.out.print(x+ " ");
        }


    }

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = 0;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            } else {
                rear += 1;
                arr[rear] = data;
            }

        }
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } 
            int val = arr[front];
            arr[front] = 0;
            front++;
            return val;
        }
        
        public static int remove2() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } 
            int front2=0;
            int val = arr[front2];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;            
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0]; 
        }

    }

}

package _12queue;

import java.util.Stack;

public class queueStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    static class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
     
        while(!s1.isEmpty()){
            int val = s1.pop();
            s2.push(val);
        }
        s1.push(data);

        while(!s2.isEmpty()){
            int val = s2.pop();
            s1.push(val);
        }
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return s1.pop();
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return s1.peek();
    }

}
}
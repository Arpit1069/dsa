package _11stack;

import java.util.ArrayList;

public class stackAL {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30); 
        System.out.println(s.list);
        System.out.println(s.pop());
        System.out.println(s.list);
        System.out.println(s.peek());


    }
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isempty(){
            return list.size() == 0;
        }
        public static void push(int i){
            list.add(i);
        } 
        public static int  pop(){
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
}

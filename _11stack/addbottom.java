package _11stack;

import java.util.Stack;

public class addbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        bottom(s, 40);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        bottom(s, data);
        s.push(top);

    }
}

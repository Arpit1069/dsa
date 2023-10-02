package _11stack;

import java.util.Stack;

public class reversestr {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "Arpit";
        String rev = "";
        int i =0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        } 
        while(i>0){
            char ch = s.pop();
            rev += ch;
            i--;
        } 
        System.out.println(rev);
    }
    
}

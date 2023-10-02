package _11stack;

import java.util.Stack;

public class nextGreater {
    public static void findgreater(int[]array,int[] greater){
        Stack<Integer> s= new Stack<>();
            greater[array.length-1] = -1;
            s.push(array[array.length-1]);
        for(int i= array.length-2;i>=0;i--){
            while(!s.isEmpty() && array[i]> s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                greater[i] = -1;
               
            }else{
                greater[i] = s.peek();
            }
            s.push(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {6,7,8,0,1,3};
        int[] greater = new int[array.length];
        findgreater(array, greater);
        for(int x: greater){
            System.out.println(x);
        }

    }
}

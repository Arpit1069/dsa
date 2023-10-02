package _12queue;

import java.util.*;

public class interleave2halves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.remove();
        }

    }
    public static void interLeave(Queue<Integer> q ){
        Queue<Integer> q1 = new LinkedList<>();
        int count =0 ;
        while(!q.isEmpty()){
            q1.add(q.remove());
            count++;
        } 
        for(int i=0;i<count/2;i++){
            q.add(q1.remove());
        }
        int flag =0;
        while(!q1.isEmpty()){
            if(flag == 0){
                q.add(q.remove());
                flag =1;
            }
            else{
                q.add(q1.remove());
                flag = 0;
            }
        }

    }
    
}

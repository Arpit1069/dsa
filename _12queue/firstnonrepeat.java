package _12queue;

import java.util.*;

import _7recursion.factorial;

public class firstnonrepeat {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        String str = "aabccxbcdxf ";

        int freq[] = new int[26];
        int i =0;
        while(i<str.length()){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch -'a']++;
            while( !q.isEmpty() &&freq[q.peek() -'a'] > 1){
                q.remove();
            } 
            if(q.isEmpty()){
                System.out.print( -1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
            i++;
              
        }

    }
}

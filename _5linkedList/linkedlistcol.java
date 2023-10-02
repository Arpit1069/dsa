package _5linkedList;

import java.util.*;
public class linkedlistcol {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(10);
        ll.addFirst(20);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}

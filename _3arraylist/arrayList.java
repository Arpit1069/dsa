package _3arraylist;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(1));
        al.remove(1);
        System.out.println(al);
        al.set(0,20 );
        System.out.println(al);
        System.out.println(al.contains(20));
        
    }
}

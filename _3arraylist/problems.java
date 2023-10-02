package _3arraylist;


import java.util.*;

public class problems {
    public static void swap(ArrayList<Integer> al, int i1,int i2){
        int temp = al.get(i1);
        al.set(i1, al.get(i2));
        al.set(i2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        for(int i =al.size()-1;i>=0;i--){
            System.out.println(al.get(i)); 
        }
         int max = Integer.MIN_VALUE;
        for(int i =0;i<al.size();i++){
            if(max< al.get(i)){
                max = al.get(i);
            }

        }
        System.out.println("max :"+max);
        System.out.println(al);
        swap(al, 1, 3);
        swap(al, 4, 5);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);

    }
}
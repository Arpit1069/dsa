package _3arraylist;

import java.util.ArrayList;

public class multiDarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainlist.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        mainlist.add(list1);
        System.out.println(mainlist);
        for(int i =0 ;i<mainlist.size();i++){
            ArrayList<Integer> curr = mainlist.get(i);
            for(int j = 0 ; j<curr.size();j++){
                System.out.print(curr.get(j));
            }
            System.out.println();
        }
    }
}

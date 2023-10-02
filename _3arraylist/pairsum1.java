package _3arraylist;

import java.util.ArrayList;

public class pairsum1 {
    public static ArrayList<ArrayList<Integer>> targetpair(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            ArrayList<Integer> al = new ArrayList<>();
            int sum = list.get(i) + list.get(j);
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                al.add(list.get(i));
                al.add(list.get(j));
                mainlist.add(al);
                i++;
                j--;
            }
        }
        return mainlist;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =6;
        System.out.println(targetpair(list, target));
    }
}

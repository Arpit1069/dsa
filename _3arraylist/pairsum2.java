package _3arraylist;

import java.util.ArrayList;

public class pairsum2 {
    public static ArrayList<ArrayList<Integer>> targetpair(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
         int p =0;
        for(int i =0 ; i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                p =i;
            }
        }
        int i = p+1;
        int j = p;
        while (i != j) {
            ArrayList<Integer> al = new ArrayList<>();
            int sum = list.get(i) + list.get(j);
            if (sum < target) {
                i = (i+1)% list.size();
            } else if (sum > target) {
                j = (list.size() -1 +j)%list.size();
            } else {
                al.add(list.get(i));
                al.add(list.get(j));
                mainlist.add(al);
                i = (i+1)% list.size();
                j = (list.size() -1 +j)%list.size();
            }
        }
        return mainlist;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 17;
        System.out.println(targetpair(list, target));
    }
}

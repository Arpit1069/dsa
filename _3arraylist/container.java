package _3arraylist;

import java.util.ArrayList;

public class container {
    public static int watercontain(ArrayList<Integer> list){
        int i = 0;
        int j = list.size() -1 ;
         int maxwater =0;
        while(i<j){
            int currwater = Math.min(list.get(i),list.get(j)) * (j-i);
            maxwater = Math.max(maxwater, currwater);
            if(list.get(i)<list.get(j)){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(watercontain(list));

    }
}

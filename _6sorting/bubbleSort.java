package _6sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {5,4,1,3,2};
        for(int turn = 0; turn<array.length-1;turn++){
            for(int i = 0; i<array.length-1-turn;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for(int x: array){
            System.out.println(x);
        }
    }
    public static void swap(int[] array,int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

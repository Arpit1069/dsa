package _6sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {5,4,1,3,2};
        for(int i = 0; i<array.length-1;i++){
            int small = i;
            for(int j = i+1; j<array.length;j++){
                if(array[small]>array[j]){
                    small = j;
                }
            }
            swap(array,small,i);
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

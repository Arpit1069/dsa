package _6sorting;

public class quickSort {
    public static void main(String[] args) {
        int[] array = { 6, 3, 9, 8, 2, 5 };
        quicksort(array, 0, array.length - 1);
        for(int x : array){
            System.out.print(x+ " ");
        }
    }

    public static void quicksort(int[] array, int si, int ei) {
        if (si < ei) {
            int i = si - 1;
            int k = si;
            int pivot = ei;
            while (k <= pivot) {
                if (array[k] < array[pivot]) {
                    i++;
                    swap(array, i, k);
                    k++;
                } else if (array[k] == array[pivot]) {
                    i++;
                    swap(array, i, pivot);
                    k++;
                } else {
                    k++;
                }

            }
            quicksort(array, si, i - 1);
            quicksort(array, i + 1, ei);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

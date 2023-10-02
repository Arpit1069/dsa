package _2multiDarray;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i][i];
        // }
        // for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
        //     if (arr.length % 2 != 0 && i == j) {
        //         sum = sum;
        //     } else {
        //         sum += arr[i][i];
        //     }
        // }
            for (int i = 0; i < arr.length; i++){
                sum += arr[i][i];
                if(i !=arr.length -i-1){
                     sum += arr[i][arr.length -i-1];
                }
               
            }
        System.out.println(sum);
    }
}

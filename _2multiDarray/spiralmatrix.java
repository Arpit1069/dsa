package _2multiDarray;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int sr = 0;
        int er = arr.length -1;
        int sc = 0;
        int ec = arr[0].length-1;

        while (sr <= er && ec >= sc) {
            for(int i = sc;i<ec;i++){
                System.out.println(arr[sr][i]);
            }
            for(int i = sr;i<er;i++){
                System.out.println(arr[i][ec]);
            }
            for(int i = ec;i>=sc;i--){
                 System.out.println(arr[er][i]);
            }
            for(int i = er-1;i>sr;i--){
                System.out.println(arr[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }

    }
}

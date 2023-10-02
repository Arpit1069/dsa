package _7recursion;


public class tilingprb {
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
    public static int tile(int n){
        if( n== 0 || n==1){
            return 1;
        }
        int vertical = tile(n-1);
        int horizontal = tile(n-2);
        int total = vertical+ horizontal;
        return total;
    }
}

package _7recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
       
        int fm1 = fibo(n - 1);
        int fm2 =  fibo(n - 2);
        int fm = fm1+fm2;
        System.out.println(fm);
        return fm;
    }
}

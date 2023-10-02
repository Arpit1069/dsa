package _4arraypattern;

public class palindromepyramid {
    public static void palindrome(int k) {
        int u = k;
        for (int i = 0; i < k; i++) {
            System.out.print(u);
            u--;
            
        }
        u++;
        for (int i = 0; i < k - 1; i++) {
            u++;
            System.out.print(u);
            
        }

    }

    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        while (k < n) {
            for (int i = 0; i < n - k+2; i++) {
                System.out.print(" ");
            }
           palindrome(k);
            for (int i = 0; i < n - 2; i++) {
                System.out.print(" ");
            }
            System.out.println();
            k++;
        }
    }
}

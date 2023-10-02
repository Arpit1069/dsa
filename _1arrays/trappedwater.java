package _1arrays;

public class trappedwater {
    public static int calculate(int[] num) {
        int left[] = new int[num.length];
        int right[] = new int[num.length];
        int trapwater = 0;
        left[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            left[i] = Math.max(num[i], left[i - 1]);
        }
        right[num.length - 1] = num[num.length - 1];
        for (int i = num.length - 2; i >= 0; i--) {
            right[i] = Math.max(num[i], right[i + 1]);
        }

        for (int i = 0; i < num.length; i++) {
            int x = Math.min(left[i], right[i]);
            trapwater = trapwater + (x - num[i]);
        }
        return trapwater;

    }

    public static void main(String[] args) {
        int[] num = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(calculate(num));
    }
}

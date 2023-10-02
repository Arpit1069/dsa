package _7recursion;

public class xpowern {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(oppower(2, 10));
    }
    public static int power(int x,int n){//O(n)
        if(n==0){
            return 1;
        }
        return x *power(x, n-1);
    }

    public static int oppower(int x,int n){//O(log n)
        if(n==0){
            return 1;
        }
        int half = power(x, n/2);
        int halfpowersq = half * half;
        if(n % 2 ==1){
            halfpowersq = x* halfpowersq;
        }
        return halfpowersq;
    }
}

package _7recursion;

public class nfriendsprb {
    public static void main(String[] args) {
        System.out.println(totalpair(3));;
    }
    public static int totalpair(int n){
        if(n== 1|| n==2){
            return n;
        }
        int single = totalpair(n-1);
        int pairways = totalpair(n-2);
        int pair = n-1 * pairways;
        int total = pair + single;
        return total;
    }
}

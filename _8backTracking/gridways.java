package _8backTracking;

import _5linkedList.linkedlistcol;

public class gridways {
    public static void main(String[] args) {
        int n= 4;
        int m = 5;
        int y = findRoute(0, 0, n, m);
        System.out.println(y);
    }
    public static int findRoute(int i,int j,int n,int m){
        // base condn
        if(i == n-1 && j== m-1){
            return 1;
        }else if(i == n || j==m){
            return 0;
        }
        //  make move
        return findRoute( i, j+1,n,m)+findRoute( i+1, j,n,m);
    }
}

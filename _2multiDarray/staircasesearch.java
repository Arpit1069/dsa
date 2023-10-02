package _2multiDarray;

public class staircasesearch {
    public static void main(String[] args) {
        int[][] a = { 
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 10;
        int m = a.length-1;
        int n = 0;
        while(n<a.length &&m>=0){
            if(key == a[n][m] ){
                System.out.println("key found at ("+n+","+m+")");
                break;
            }
            else if(key < a[n][m]){
                m--;
            }
            else{
                n++;
            }
        }
    }
}

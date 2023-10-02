package _4arraypattern;

public class numberpyramid {
    public static void main(String[] args) {
        int n =5;
        int k =1;
        while(k<n){
            for(int i =0 ;i<n-k;i++ ){
                System.out.print(" ");
            }
            for(int i =0 ;i<k;i++ ){
                System.out.print(k);
                System.out.print(" ");
            }
            for(int i =0 ;i<n-2;i++ ){
                System.out.print(" ");
            }
            System.out.println();
            k++;
        }
    }
}

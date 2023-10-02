package _7recursion;

public class nto1 {
    public static void main(String[] args) {
      printdec(10); 
      printasec(10); 
    }

    public static void printdec(int n){
        System.out.print(n +" ");
        if(n==1){
            return;
        }
        printdec(n-1);
    }
    public static void printasec(int n){
         if(n==1){
            System.out.print(n +" ");
            return;
        }
        printasec(n-1);
        System.out.print(n +" ");
       
    }
}

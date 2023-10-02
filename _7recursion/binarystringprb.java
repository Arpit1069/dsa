package _7recursion;

public class binarystringprb {
    public static void main(String[] args) {
        printstr(3,"", 1);
    }
    public static void printstr(int n,String str,int last){
        if( n== 0){
            System.out.println(str);
            return;
        }
        printstr(n-1, str+"1", 1);
        if(last == 1){
            printstr(n-1, str+"0", 0);
        }
    }
}

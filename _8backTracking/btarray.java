package _8backTracking;
public class btarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        changeArray(a, 0, 1);
        printArray(a);
    }
    public static void changeArray(int[]a,int i,int val){
        if(i == a.length){
            return;
        }

        a[i] = val;
        changeArray(a, i+1, val+1);
        a[i] = a[i] -2;
    }
    public static void printArray(int[] a) {
        for(int x:a){
            System.out.print(x+ " ");
        }
    }
}

package _7recursion;

public class isSorted {
    public static void main(String[] args) {
       int[] n = {1,2,3,4,5};
       System.out.println(sort(n, 0)); 
    }
    public static boolean sort (int[] n,int i){
        if(i == n.length-1){
            return true;
        }
        if(n[i] > n[i+1]){
            return false;
        }
        
        return sort(n, i+1);
    }
}

package _7recursion;

public class firstoccur {
    public static void main(String[] args) {
        int[] n = {8,3,6,9,5,10,5};
        System.out.println(occur(n, 5, 0));;
        System.out.println(lastoccur(n, 5, n.length-1));
        System.out.println(lastoccur2(n, 5, 0));
    }
    public static int occur(int[] n,int key,int i){
        if(i== n.length-1){
            return -1;
        }
        if( key == n[i]){
            return i;
        }
        return occur(n, key, i+1);
    }
    public static int lastoccur(int[] n,int key,int i){
        if(i== 0){
            return -1;
        }
        if( key == n[i]){
            return i;
        }
        return occur(n, key, i-1);
    }
    public static int lastoccur2(int[] n,int key,int i){
        if(i== n.length){
            return -1;
        }
        int isFound = lastoccur2(n,key,i+1);
        if( key == n[i] && isFound == -1){
            return i;
        }
        return isFound;
    }
}

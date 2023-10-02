package _6sorting;

public class rotatedArray {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};

    }
     public static int search(int[] array, int target,int si,int ei){
        int mid  = si + (ei-si)/2;
        if(array[mid] == target){
            return mid;
        }
        if(array[si]<= array[mid]){
             if(array[si]<= target && target<= array[mid]){
                return search(array, target, si, mid);
             }
             else{
                return search(array, target, mid+1,ei);
             }
        }
        else{
            if(array[mid]<= target && target<= array[ei]){
                return search(array, target, mid+1,ei);
             }
             else{
                return search(array, target, si, mid-1);
             }
        }
     }
}

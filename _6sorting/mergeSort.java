package _6sorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] array ={6,3,9,5,2,8};
        mergesort(array, 0, array.length-1);
        for(int x : array){
            System.out.print(x+ " ");
        }
    }
    public static void mergesort(int[] array,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+((ei-si)/2);
        mergesort(array, si, mid);
        mergesort(array, mid +1, ei);
        merge(array, si, mid, ei);

    }
    public static void merge(int[] array,int si,int mid,int ei){
        int[]temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(array[i]<array[j]){
                temp[k] = array[i];
                i++;
            }
            else{
                temp[k] = array[j];
                j++; 
            }
               k++;           

        }
        while(i<= mid){
            temp[k++] = array[i++];
        }
        while(j<= ei){
            temp[k++] = array[j++];
        }
        
        for(k =0,i=si;k<temp.length;k++,i++){
            array[i] = temp[k];
        }
    }
}

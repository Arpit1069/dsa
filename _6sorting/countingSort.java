package _6sorting;

public class countingSort {
    public static void main(String[] args) {
        int[] array = {1,4,1,0,2,4,3,7};
        int large = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            large = Math.max(large, array[i]);
        }
        int [] count = new int[large+1];
        for(int i = 0;i<count.length;i++){
            count[array[i]]++;
        }
        int j = 0;
        int con =0;
        while(j<count.length){
            if(count[j] != 0){
                array[con] = j;
                count[j]--;
                con++;
            }
            else{
                j++;
            }
        }
        for(int x: array){
            System.out.print(x +" ");
        }  
    }
}

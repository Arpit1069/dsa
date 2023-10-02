package _2multiDarray;

import java.util.Scanner;

public class matrixbasics {
    public static boolean search(int array[][],int key){
        for(int i =0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){
                if(key == array[i][j]){
                    System.out.println("key found");
                    return true;
                }
                
            }
            
        }
        System.out.println("key not found"); 
        return false;
        
    }
    public static void main(String[] args) {
        int [ ][ ] array = new int[3][3];
        int n=array.length,m=array[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        search(array,5);
    }
}

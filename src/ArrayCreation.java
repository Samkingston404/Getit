import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
       int[] Array = {12,13,14,1,2,3,55};
       System.out.println(Arrays.toString(Array));
       for(int i = 0; i < Array.length;i++) {
           System.out.print(Array[i] + " ");
       }
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] Array2 = new int[n];
           for(int k = 0; k < Array2.length; k++) {
               Array2[k] = in.nextInt();
           }
           for(int k = 0; k < Array2.length; k++) {
               if(k == Array2.length - 1) {
                   System.out.print(Array2[k]);
               }
               else {
                   System.out.print(Array2[k]+" ");
               }
           }
    }
}

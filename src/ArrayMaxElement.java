import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] Array = new int[N];
        for(int i = 0; i < Array.length; i++) {
            Array[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE; // we can also use max = Array2[0]
        for(int i = 0; i < Array.length; i++) {
            if(Array[i] > max) {
                max = Array[i];
            }

        }
        System.out.println(max);

    }
}

import java.util.Scanner;

public class ArrayMinElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] Array = new int[N];
        for(int i = 0; i < Array.length; i++) {
            Array[i] = in.nextInt();
        }
        int min = Array[0];
        for(int i = 1; i < Array.length; i++) {
            if(Array[i] < min) { // min = Math.min(min, Array[i]);
                min = Array[i];
            }
        }
        System.out.println(min);
    }
}
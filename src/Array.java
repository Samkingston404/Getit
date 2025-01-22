import java.util.*;
public class Array {
    public static void main(String[] args) {
        int N = 5;
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = i;
        }
        for(int i = 0; i < N; i++) {
            System.out.print(A[i]+ " ");
        }
    }
}

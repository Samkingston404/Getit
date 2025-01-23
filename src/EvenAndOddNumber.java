//public class EvenAndOddNumber {
//    public static void main(String[] args) {
//        int number = 12;
//        if(number % 2 == 0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("odd");
//        }
//    }
//}

import java.util.*;
public class EvenAndOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:- ");
        int number = in.nextInt();
        if(number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
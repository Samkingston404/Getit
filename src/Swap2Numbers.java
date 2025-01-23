//public class Swap2Numbers {
//    public static void main(String[] args) {
//        int number1 = 1;
//        int number2 = 3;
//        int temp;
//
//            temp = number1;
//            number1 = number2;
//            number2 = temp;
//
//        System.out.println(number1);
//        System.out.println(number2);
//    }
//}
public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+" "+b);
    }
}
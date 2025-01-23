import javax.xml.transform.Source;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = in.nextInt();
        if(number <= 1) {
            System.out.println("Not a Prime");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not a Prime");
            }
        }
    }
}

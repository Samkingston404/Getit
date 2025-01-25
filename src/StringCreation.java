import java.util.Scanner;

public class StringCreation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Your name is: "+name);
        String age = in.nextLine();
        System.out.println("Your age:" + age);
        String gender = in.nextLine();
        System.out.println("Your gender: "+gender);
        System.out.println("Your Details: "+name+" "+age+" "+gender);
    }
}

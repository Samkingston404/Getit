//public class Palindrome {
//    public static void main(String[] args) {
//        String S = "sammas";
//        char[] charArray = S.toCharArray();
//        char temp;
//        for(int i = 0; i < S.length()/2; i++) {
//            temp = charArray[i];
//            charArray[i] = charArray[S.length() - 1 - i];
//            charArray[S.length() - 1 - i] = temp;
//        }
//        String reversed = new String(charArray);
//
//        if(S.equals(reversed)) {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }
//    }
//}

public class Palindrome {
    public static void main(String[] args) {
        String S = "racecar";
        String R = "";
        for(int i = S.length() - 1; i >= 0; i--) {
            R += S.charAt(i);
        }
        if(S.equals(R)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}

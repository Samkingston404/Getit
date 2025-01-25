import java.util.*;
public class LongestWordInSentenceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] word = sentence.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String s : word) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestWord = s;
            }
        }
        System.out.print(longestWord);
    }
}

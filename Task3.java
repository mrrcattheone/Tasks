import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter the phrase to check for palindrome: ");
            String input = inputStream.readLine();
            if (isPalindrome(input)) {
                System.out.print("This is palindrome: ");

            } else {
                System.out.print("It's not palindrome: ");
            }


        } catch (IOException exception) {
            System.err.println("Input error");
        }
    }

    public static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if (result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }
}

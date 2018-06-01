import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> listPalindrome;
        Scanner in = new Scanner(System.in);
        int length;

        try{
            do {

                System.out.println("Enter length < 100");
                length = in.nextInt();

            }while (length > 100);

            listPalindrome = getPalindrome(length);
            for (int item : listPalindrome){
                System.out.println(item);
            }




        }catch (InputMismatchException e){
            System.out.println("You enter not integer. Error: " + e);
        }
    }

    static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if(result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }

    static ArrayList<Integer> getPalindrome(int length){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= length; i++) {
            if (isPalindrome(String.valueOf(i))){
                list.add(i);
            }

        }
        return list;
    }

}
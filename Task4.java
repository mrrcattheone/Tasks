import java.util.Scanner;

public class Task4 {

    public static void main(String args[]) {
        System.out.println("Enter the text");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            searchRegEx(in.nextLine());
        } else {
            System.out.println("Wrong input data");
        }
    }

    static void searchRegEx(String text) {
        String[] textArray = text.split("\\s+|,+|\\s,|,\\s");
        int counter = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (!textArray[i].isEmpty()) {
                System.out.println(textArray[i]);
            }
        }
    }
}
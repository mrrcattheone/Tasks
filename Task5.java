import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println("Введите слово, которое нужно посчитать");
        String word = in.nextLine();

        int countWordInText = searchWordCount(text, word);
        System.out.println(countWordInText);


    }


    static int searchWordCount(String text, String word) {

        String[] textArray = text.split("\\s+|\\,|\\,");

        int counter = 0;

        for (int i = 0; i < textArray.length; i++) {
            if (word.equals(textArray[i])){
                counter++;
            }
        }

        return counter;
    }
}
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int amount = 0;
            int numberOfEvenNumbers = 0;
            System.out.println("Even numbers are: ");
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    numberOfEvenNumbers++;
                    amount = amount + i;
                }
            }

            System.out.printf("Summ is: " + numberOfEvenNumbers + ", sum of even is: "+amount);
        } else {
            System.out.println("Wrong input data");
        }
    }
}

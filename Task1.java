import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.print("Number " + n + " is ");
            if (n % 2 == 0) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
            System.out.print(" and ");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print("Composite");
                    return;
                }
            }
            System.out.print("Simple");
        } else {
            System.out.println("Wrong input data");
        }
    }
}

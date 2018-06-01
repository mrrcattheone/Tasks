import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numberOne;
        double numberTwo;
        double numberThree;

        try {
            System.out.println("Enter the first number");
            numberOne = in.nextDouble();
            System.out.println("Enter the second number");
            numberTwo = in.nextDouble();
            System.out.println("Enter the third number");
            numberThree = in.nextDouble();

            if (checkTriangle(numberOne, numberTwo, numberThree)) {
                System.out.println("It is possible");
            } else {
                System.out.println("It is not possible");
            }

        } catch (InputMismatchException e) {
            System.out.println("You enter not number. Error: " + e);
        }
    }

    static boolean checkTriangle(Double numberOne, double numberTwo, double numberThree) {
        boolean rightAngledTriangle = false;
        if (numberOne > 0 && numberTwo > 0 && numberThree > 0) {
            boolean compare1 = Math.pow(numberOne, 2) == Math.pow(numberTwo, 2) + Math.pow(numberThree, 2);
            boolean compare2 = Math.pow(numberTwo, 2) == Math.pow(numberOne, 2) + Math.pow(numberThree, 2);
            boolean compare3 = Math.pow(numberThree, 2) == Math.pow(numberTwo, 2) + Math.pow(numberOne, 2);

            if (compare1 || compare2 || compare3) {
                rightAngledTriangle = true;
            }
        } else {
            rightAngledTriangle = false;
        }
        return rightAngledTriangle;
    }
}
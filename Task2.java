import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOne;
        int numberTwo;


        try{
            System.out.println("Enter the first number");
            numberOne = in.nextInt();
            System.out.println("Enter the second number");
            numberTwo = in.nextInt();

            System.out.println("Sum = " + (numberOne + numberTwo));
            System.out.println("Difference = " + (numberOne - numberTwo));
            System.out.println("Greatest common divisor = " + gcd(numberOne, numberTwo));
            System.out.println("Least common multiple = " + lcm(numberOne, numberTwo));


        }catch (InputMismatchException e){
            System.out.println("Wrong input data. Error: " + e);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    static int lcm (int a, int b){
        return a*(b/gcd(a,b));
    }
}
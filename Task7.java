import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        if (in.hasNextInt()) {
            n = in.nextInt();
            arr = new int[n];
            int biggest = 0;
            int smallest = 100;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (10 + Math.random() * 90);
                if (arr[i] > biggest) {
                    biggest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("Smallest "+smallest+" Biggest "+biggest);

        }
    }
}

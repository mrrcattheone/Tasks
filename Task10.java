import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;

        try{
            do {

                System.out.println("Enter 3 numbers: ");
                numberOne = in.nextInt();
                numberTwo = in.nextInt();
                numberThree = in.nextInt();

            }while ((numberOne < 0) || (numberOne >= 10) || (numberTwo < 0) || (numberTwo >= 10) || (numberThree < 0) || (numberThree >= 10));


            int[][] variations = getVariations(new int[]{numberOne, numberTwo, numberThree});

            for (int[] s : variations) {
                System.out.println(Arrays.toString(s));
            }



        }catch (InputMismatchException e){
            System.out.println("Wrong input data. Error: " + e);
        }


    }

    private static int[][] getVariations(int[] source) {
        int srcLength = source.length;
        int permutations = (int) Math.pow(srcLength, 3);

        int[][] table = new int[permutations][3];

        for (int i = 0; i < 3; i++) {
            int t2 = (int) Math.pow(srcLength, i);
            for (int p1 = 0; p1 < permutations;) {
                for (int al = 0; al < srcLength; al++) {
                    for (int p2 = 0; p2 < t2; p2++) {
                        table[p1][i] = source[al];
                        p1++;
                    }
                }
            }
        }

        return table;
    }



}
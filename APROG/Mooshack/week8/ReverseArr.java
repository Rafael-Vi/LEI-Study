import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberQtn = scanner.nextInt();
        if (numberQtn != 0) {
            int[] numberArray = fillArray(numberQtn, scanner);
            for (int i = numberQtn-1; i >= 0; i--) {
                System.out.println(numberArray[i]);
            }
        }


    }
    public static int[] fillArray(int numberQtn, Scanner scanner) {
        int[] numberArray = new int[numberQtn];
        for (int i = 0; i < numberQtn; i++) {
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }

}


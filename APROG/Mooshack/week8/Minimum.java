import java.util.Scanner;

public class Minimum {
    public static int numberCount = 0;
    public static final int PREDIFINED_SIZE = 10;

    public static void main(String[] args) {
        int numberArray[] = new int[PREDIFINED_SIZE];
        fillArray(numberArray);
        if (numberCount > 0) {
            minimum(numberArray);
        }
    }

    public static void minimum(int[] numberArray) {
        int min = numberArray[0];
        int minOcurrence = 1; // Initialize to 1 since the first element is the minimum initially
        for (int i = 1; i < numberCount; i++) { // Loop only through the filled part of the array
            if (numberArray[i] < min) {
                min = numberArray[i];
                minOcurrence = 1; // Reset to 1 when a new minimum is found
            } else if (numberArray[i] == min) {
                minOcurrence++; // Increment when the same minimum is found
            }
        }
        System.out.println("min=" + min);
        System.out.println("occurrences=" + minOcurrence);
    }

    public static void fillArray(int[] numberArray) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < numberArray.length; i++) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            numberCount++;
            numberArray[i] = number;
        }
    }
}
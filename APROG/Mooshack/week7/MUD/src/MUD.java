import java.util.Scanner;

public class MUD {
    public static void main(String[] args) {
        int uniqueCounter = 0;
        int numberCounter = 0;
        int negativeNumberCounter = 0;
        final int LAST_NUMBER = 0;
        Scanner scanner = new Scanner(System.in);
        int number;


        number = scanner.nextInt();
        while (number != LAST_NUMBER) {
            numberCounter++;
            if (number < 0) {
                negativeNumberCounter++;
            }
            if (isUnique(number)) {
                uniqueCounter++;
                System.out.println(number);
            }
            number = scanner.nextInt();
        }
    if (numberCounter != 0) {
        System.out.printf("negatives: %.2f%%\n", (negativeNumberCounter * 100.0) / numberCounter);
        System.out.printf("positives: %.2f%%\n", ((numberCounter - negativeNumberCounter) * 100.0) / numberCounter);
        System.out.printf("with unique digits: %.2f%%\n", (uniqueCounter * 100.0) / numberCounter);
    }

    }

    public static boolean isUnique(int number) {
        char digit;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            digit = numberStr.charAt(i);
            for (int j = i + 1; j < numberStr.length(); j++) {
                if (digit == numberStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
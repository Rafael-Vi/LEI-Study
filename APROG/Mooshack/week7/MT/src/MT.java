import java.util.Scanner;

public class MT {
    public static void main(String[] args) {
        int number = readPositiveValue();
        int number2 = readPositiveValue();
        showTablesInRange(number, number2);
    }
    public static int readPositiveValue() {
        Scanner scanner = new Scanner(System.in);
        int numberRead = scanner.nextInt();
        while (numberRead <= 0) {
            numberRead = scanner.nextInt();
        }
        return numberRead;
    }
    public static void showTablesInRange(int number, int number2) {
        int minRange = Math.min(number, number2);
        int maxRange = Math.max(number, number2);
        for (int i = minRange; i <= maxRange; i++) {
            showTableOfNumber(i);
        }
    }
    public static void showTableOfNumber(int number) {
        System.out.println("Multiplication table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
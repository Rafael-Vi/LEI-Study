import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previous = -1; // Initialize to -1 to skip the first input
        int N = scanner.nextInt();
        while (N >= 0) {
            if (previous >= 0 && N > previous) {
                int number = N;
                boolean isIncreasing = true;
                int lastDigit = number % 10;
                number /= 10;
                while (number > 0) {
                    int currentDigit = number % 10;
                    if (currentDigit >= lastDigit) {
                        isIncreasing = false;
                        break;
                    }
                    lastDigit = currentDigit;
                    number /= 10;
                }
                if (isIncreasing) {
                    System.out.println(N);
                }
            }
            previous = N;
            N = scanner.nextInt();
        }
    }
}
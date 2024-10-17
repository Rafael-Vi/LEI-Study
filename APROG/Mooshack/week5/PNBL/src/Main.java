import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int prime = 1;

        do {
            int divisors = 0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    divisors++;
                }
                if (divisors > 2) {
                    break;
                }
            }
            if (divisors == 2) {
                System.out.println(prime);
            }
            prime++;
        }while(prime <= number);
    }
}
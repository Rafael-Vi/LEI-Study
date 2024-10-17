import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        int algCounter = numberString.length();
        int alg = 0;
        int evenCounter = 0;
        int max = 0;
        for (int i = 0; i < algCounter; i++) {
            alg = number % 10;
            number = number / 10;
            if (alg % 2 == 0) {
                evenCounter++;
            }else {
                if (alg > max) {
                    max = alg;
                }
            }
        }
        double result = (double) evenCounter / algCounter * 100;
        if (evenCounter == 0) {
            System.out.println(String.format("%.2f%%", result));
            Sys<tem.out.println(max);
        } else {
           System.out.println(String.format("%.2f%%", result));
            if (max == 0) {
                System.out.println("no odd digits");
            } else {
                System.out.println(max);
            }
        }
    }
}
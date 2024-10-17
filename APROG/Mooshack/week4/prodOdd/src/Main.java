import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        while (number > 0) {
            int numberWLoop = number;
            int numberTemp = 0;
            int prod = 1;
            int qnt = 0;
            do {
                numberTemp = numberWLoop % 10;
                numberWLoop /= 10;
                if (numberTemp % 2 != 0) {
                    prod *= numberTemp;
                    qnt += 1;
                }
            } while (numberWLoop > 0);
            if (qnt == 0) {
                System.out.println("no odd digits");
            } else {
                System.out.println(prod);
            }
            number = sc.nextInt();
        }
    }
}
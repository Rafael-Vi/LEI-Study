import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int qntDiv = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                qntDiv++;
            }

        }
        if (qntDiv > 2  || qntDiv == 1) {
            System.out.println("not prime");
        }else {System.out.println("prime");}
    }
}
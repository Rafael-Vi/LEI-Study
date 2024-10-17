import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int maxDiv = number1*number2;
        for(int i = 1; i <= maxDiv; i++) {
            if(i % number1 == 0 && i % number2 == 0) {
                System.out.println(i);
                break;
            }
        }


    }
}
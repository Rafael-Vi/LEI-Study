import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int multipleQtn = 0;
        for(int i = 3; i <= Number; i+=3) {
            if(Number % i == 0) {
                multipleQtn++;
                System.out.println(i);
            }
        }
        if (multipleQtn == 0) {
            System.out.println("without dividers multiples of 3");
        }

    }
}
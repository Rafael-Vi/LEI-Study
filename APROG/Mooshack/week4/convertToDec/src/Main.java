import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number > 0){
            int numberTemp = number;
            int numberDec = 0;
            int base = 8;
            int pot = 0;
            do {
                int digit = numberTemp % 10;
                numberDec += digit * Math.pow(base,pot); // Convert to decimal
                numberTemp /= 10;
                pot++ ;
            }while(numberTemp > 0);
            System.out.println(numberDec);
            number = sc.nextInt();
        };
    }
}
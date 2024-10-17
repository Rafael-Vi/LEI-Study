import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
    while(number >0){
        int numberWLoop = number;
        int numberTemp = 0;
        int sum = 0;
                do

        {
            numberTemp = numberWLoop % 10;
            numberWLoop /= 10;
            if (numberTemp % 2 == 0) {
                sum += numberTemp;
            }
        } while(numberWLoop >0);
                System.out.println(sum);
        number = sc.nextInt();
    }
    }
}
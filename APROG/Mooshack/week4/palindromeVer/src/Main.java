import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberTemp = number;
        int palindrome = 0;
        int power = -1;
        while (numberTemp > 0){
            numberTemp /= 10;
            power++;
        }
        numberTemp = number;
        int digit = 0;
        for(int i = power; i >= 0; i--){
            digit = numberTemp % 10;
            palindrome += digit * Math.pow(10, i);
            numberTemp /= 10;
        }
        if (palindrome == number){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
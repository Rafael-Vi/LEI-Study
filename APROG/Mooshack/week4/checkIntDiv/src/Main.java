import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int qnt = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
                qnt++;
            }
        }
        System.out.println("("+qnt+")");
    }
}
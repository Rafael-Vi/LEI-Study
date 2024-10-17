import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pefectNumberCap = scanner.nextInt();
        int output = 0;
        int i = 1;
        do {
            int sumNum = 0;
            for (int j = 1; j < i - 1; j++) {
                if (i % j == 0) {
                    sumNum += j;
                }
            }
            if (sumNum == i) {
                System.out.println(i);
                output++;
            }
            i++;
        }while(output < pefectNumberCap);
    }
}
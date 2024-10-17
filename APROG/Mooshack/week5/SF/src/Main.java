import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int output = 0;
        int outputnext = 1;
        if (N == 1) {
            System.out.println(output);
            return;
        }
        else if (N == 0) {
            return;
        }
        System.out.println(output);
        System.out.println(outputnext);

        for (int i = 2; i < N; i++) {
            int sum = output + outputnext;
            System.out.println(sum);
            output = outputnext;
            outputnext = sum;
        }
    }
}
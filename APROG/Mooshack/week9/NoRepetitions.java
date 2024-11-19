import java.util.Scanner;

public class NoRepetitions {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int readSize = sc.nextInt();
        int[] numbersRead;
        numbersRead = new int[readSize];
        read_Numbers(numbersRead);
        print_Numbers(numbersRead);
    }

    public static void read_Numbers(int[] numbersRead) {
        for (int i = 0; i < numbersRead.length; i++) {
            numbersRead[i] = sc.nextInt();
        }
    }

    public static void print_Numbers(int[] numbersRead) {
        int[] numbersCopyArr = new int[numbersRead.length];
        int copySize = 0;

        for (int i = 0; i < numbersRead.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < copySize; j++) {
                if (numbersCopyArr[j] == numbersRead[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(numbersRead[i]);
                numbersCopyArr[copySize] = numbersRead[i];
                copySize++;
            }
        }
    }
}
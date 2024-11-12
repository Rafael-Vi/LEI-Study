import java.util.Scanner;

public class rotateArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberQtn = scanner.nextInt();
        if (numberQtn > 1) {
            int[] numberArray = fillArray(numberQtn, scanner);
            String direction = scanner.next();
            while (!direction.equals("exit")) {
                switch(direction) {
                    case "right":
                        Right(numberArray);
                        break;
                    case "left":
                        Left(numberArray);
                        break;
                    case "exit":
                        break;
                }
                direction = scanner.next();
            }
        }
    }
    public static int[] fillArray(int numberQtn, Scanner scanner) {
        int[] numberArray = new int[numberQtn];
        for (int i = 0; i < numberQtn; i++) {
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }
    public static void Right(int[] numberArray) {
        int temp = numberArray[numberArray.length-1];
        for (int i = numberArray.length-1; i > 0 ; i--) {
            numberArray[i] = numberArray[i-1];
        }
        numberArray[0] = temp;
        printArr(numberArray);
    }
    public static void Left(int[] numberArray) {
        int temp = numberArray[0];
        for (int i = 0; i < numberArray.length-1 ; i++) {
            numberArray[i] = numberArray[i+1];
        }
        numberArray[numberArray.length-1] = temp;
        printArr(numberArray);
    }

    public static void printArr(int[] numberArray) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            System.out.printf("[%d]",numberArray[i]);
        }
        System.out.printf("[%d]\n",numberArray[numberArray.length-1]);
    }
}

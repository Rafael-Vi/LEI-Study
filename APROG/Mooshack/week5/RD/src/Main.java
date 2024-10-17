import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            boolean flag = false;
            String numberStr = Integer.toString(number);
            for (int i = numberStr.length() - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (numberStr.charAt(i) == numberStr.charAt(j)) {
                        int pos1 = numberStr.length() - i;
                        int pos2 = numberStr.length() - j;
                        System.out.println("" + number + " : digit (" + numberStr.charAt(i) + ") repeated in positions (" + pos1 + ") and (" + pos2 + ")");
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    break;
                }
            }
            number = scanner.nextInt();
        }
    }
}
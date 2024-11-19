import javax.swing.*;
import java.util.Scanner;

public class Vizinhos {
    public static final int ARR_LENGHT = 30;

    public static int arraySize = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers = fill_Array(scanner);
        for (int i = 1; i < arraySize - 1; i++) {
            if (better_Than_Neighbour(arrayNumbers, i)){
                System.out.println(arrayNumbers[i]);
            }
        }
    }
    public static boolean better_Than_Neighbour(int[] arrNumbers, int Index){
        if (arrNumbers[Index] > arrNumbers[Index - 1] && arrNumbers[Index] > arrNumbers[Index + 1]){
            return true;
        }
        return false;
    }

    public static int[] fill_Array(Scanner scanner){
        int[] arrNumbers = new int[ARR_LENGHT];
        for (int i = 0; i < ARR_LENGHT; i++){
            arrNumbers[i] = scanner.nextInt();
            if (arrNumbers[i] == -1){
                arraySize = i;
                break;
            }
        }
        return arrNumbers;
    }
}

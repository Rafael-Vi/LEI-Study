import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        read_array(matrix);
        printDiagonals(matrix);
    }

    public static void read_array(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void printDiagonals(int[][] matrix) {
        for (int i = matrix.length; i >= 0; i--) {
            for (int j = 0; j < matrix.length - i; j++) {
                System.out.printf("[%d]", matrix[j][i + j]);
            }
            System.out.println();
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                System.out.printf("[%d]", matrix[i + j][j]);
            }
            System.out.println();
        }

    }

}

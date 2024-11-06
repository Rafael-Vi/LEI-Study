import java.util.Scanner;

public class absoluteFreq {
    public static final int UPPERBOUND = 21;
    public static final int LOWERBOUND = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gradesRead = sc.nextInt();
        int[] array =  readStoreGrades(gradesRead, sc);
        absoluteFreq(array);
    }
    public static int[] readStoreGrades(int gradesRead, Scanner sc){
        int[] array = new int[UPPERBOUND];
        for (int i = 0; i < gradesRead; i++) {
            int grade = sc.nextInt();
            array[grade]++;
        }
        return array;
    }
    public static void absoluteFreq(int[] array){
        for (int i = LOWERBOUND; i < UPPERBOUND; i++) {
            System.out.println(i + " "+ array[i]);
        }
    }
}

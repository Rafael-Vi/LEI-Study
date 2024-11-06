<<<<<<< HEAD
import java.util.Scanner;

public class AprogRatings {
    public static final int GRADE_MINIMUM=10;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ClassSize = scanner.nextInt();
        int[] Ratings = createArray(ClassSize);
        for (int i = 0; i < ClassSize; i++) {
            Ratings[i] = scanner.nextInt();
        }
        average(Ratings);
    }
    public static int[] createArray(int size) {
        int[] NewArray = new int[size];
        return NewArray;
    }
    public static void average(int[] Ratings) {
        int sum = 0;
        int failureCount = 0;
        double average=0;
        for (int i = 0; i < Ratings.length; i++) {
            if (Ratings[i] < GRADE_MINIMUM) {
                failureCount++;
            }
            sum += Ratings[i];
        }
        if (sum > 0) {
            average = (double) sum / Ratings.length;
        }
        System.out.printf("average=%.1f\n", average);
        System.out.println("failures=" + failureCount);
    }
=======
package PACKAGE_NAME;

public class AprogRatings {
>>>>>>> origin/APROG
}

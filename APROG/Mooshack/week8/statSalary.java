import java.util.Scanner;

public class statSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[0];
        double[] salaries = new double[0];
        double average = 0;

        int counter = 0;
        String name = sc.next();
        while (!name.equals("end")) {
            names = resizeArray(names, counter + 1);
            salaries = resizeArray(salaries, counter + 1);

            String salaryStr = sc.next();
            double salary = Double.parseDouble(salaryStr);
            average += salary;
            names[counter] = name;
            salaries[counter] = salary;

            name = sc.next();
            counter++;
        }

        average = average / counter;
        System.out.printf("%.1f \n", average);
        printNamesBelowAverage(names, salaries, average);
    }

    private static String[] resizeArray(String[] array, int newSize) {
        String[] newArray = new String[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static double[] resizeArray(double[] array, int newSize) {
        double[] newArray = new double[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static void printNamesBelowAverage(String[] names, double[] salaries, double average) {
        for (int i = 0; i < names.length; i++) {
            if (salaries[i] < average) {
                System.out.println(names[i]);
            }
        }
    }


}
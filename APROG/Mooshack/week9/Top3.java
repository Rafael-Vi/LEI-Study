import java.util.Scanner;

public class Top3 {
    public static final int ARR_LENGHT = 123123;
    public static Scanner sc = new Scanner(System.in);
    public static int readSize = 0;

    public static void main(String[] args) {
        int[] arrSalaries = new int[ARR_LENGHT];
        String[] arrNames = new String[ARR_LENGHT];

        readStuff(arrSalaries, arrNames);
        printTop3(arrSalaries, arrNames);
    }

    public static void readStuff(int[] arrSalaries, String[] arrNames) {
        while (readSize < ARR_LENGHT) {
            arrNames[readSize] = sc.nextLine();
            if (arrNames[readSize].equals("END")) {
                break;
            }
            arrSalaries[readSize] = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            readSize++;
        }
    }

    public static void printTop3(int[] arrSalaries, String[] arrNames) {
        int[] topIndices = findTop3Indices(arrSalaries, arrNames);
        String[] topNames = new String[3];
        int[] topSalaries = new int[3];

        for (int i = 0; i < 3; i++) {
            if (topIndices[i] != -1) {
                topNames[i] = arrNames[topIndices[i]];
                topSalaries[i] = arrSalaries[topIndices[i]];
            } else {
                topNames[i] = "";
                topSalaries[i] = -1;
            }
        }

        sortTop3(topNames, topSalaries);

        if (topSalaries[0] != -1) {
            System.out.println("#1:" + topNames[0] + ":" + topSalaries[0]);
        }
        if (topSalaries[1] != -1) {
            System.out.println("#2:" + topNames[1] + ":" + topSalaries[1]);
        }
        if (topSalaries[2] != -1) {
            System.out.println("#3:" + topNames[2] + ":" + topSalaries[2]);
        }
    }

    public static int[] findTop3Indices(int[] arrSalaries, String[] arrNames) {
        int max1, max2, max3;
        int maxIndex1, maxIndex2, maxIndex3;
        max1 = max2 = max3 = -1;
        maxIndex1 = maxIndex2 = maxIndex3 = -1;
        for (int i = 0; i < readSize; i++) {
            if (arrSalaries[i] > max1 || (arrSalaries[i] == max1 && arrNames[i].compareTo(arrNames[maxIndex1]) < 0)) {
                max3 = max2;
                max2 = max1;
                max1 = arrSalaries[i];
                maxIndex3 = maxIndex2;
                maxIndex2 = maxIndex1;
                maxIndex1 = i;
            } else if (arrSalaries[i] > max2 || (arrSalaries[i] == max2 && arrNames[i].compareTo(arrNames[maxIndex2]) < 0)) {
                max3 = max2;
                max2 = arrSalaries[i];
                maxIndex3 = maxIndex2;
                maxIndex2 = i;
            } else if (arrSalaries[i] > max3 || (arrSalaries[i] == max3 && arrNames[i].compareTo(arrNames[maxIndex3]) < 0)) {
                max3 = arrSalaries[i];
                maxIndex3 = i;
            }
        }
        return new int[]{maxIndex1, maxIndex2, maxIndex3};
    }

    public static void sortTop3(String[] names, int[] salaries) {
        for (int i = 0; i < salaries.length - 1; i++) {
            for (int j = i + 1; j < salaries.length; j++) {
                if (salaries[i] < salaries[j] || (salaries[i] == salaries[j] && names[i].compareTo(names[j]) > 0)) {
                    int tempSalary = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = tempSalary;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
    }
}
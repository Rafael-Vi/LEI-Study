import java.util.Scanner;

public class TestQuinta {
    public final static int MIN_QUAL = 0;
    public final static int MAX_QUAL = 100;
    public final static int N_MAX_PRODUTOS = 50;
    public final static int N_MIN_PRODUTOS = 5;
    public final static int MIN_RANGE_APPROVED = 50;
    public final static int MAX_RANGE_APPROVED = 90;

    public static int counterRejected = 0;
    public static int counterApproved = 0;
    public static boolean isApproved = false;
    public static int sequenceCounter = 0;
    public static int maxSequence = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int numbersToRead = sc.nextInt();
        int sum = 0;

        while(numbersToRead < N_MIN_PRODUTOS || numbersToRead > N_MAX_PRODUTOS){
            numbersToRead = sc.nextInt();
        }

        for (int i = 0; i <= numbersToRead; i++) {
            number = readTillRange(sc);
            sum += number;
        }
        if (counterApproved == 0){
            System.out.println("No approved products");
        }
        else{
            System.out.println("Approved products = " + counterApproved);
            System.out.println("Max sequence = " + maxSequence);
            System.out.printf("Average = %.2f\n", (double)sum/numbersToRead);
            System.out.printf("Rejected(low) = %.2f\n", ((double)sum/counterRejected)*100);
        }
    }
    public static void verifyApproved(int number){
        if (number >= MIN_RANGE_APPROVED && number <= MAX_RANGE_APPROVED){
            counterApproved++;
            isApproved = true;
            checkSequence(number);
        }
        else{
            counterRejected++;
            sequenceCounter = 0;
            isApproved = false;
        }
    }
    public static int readTillRange(Scanner sc){
        int number = sc.nextInt();
        while(number < MIN_QUAL || number > MAX_QUAL){
            number = sc.nextInt();
        }
        return number;
    }
    public static void checkSequence(int number){
        if (isApproved == true){
            sequenceCounter++;
            if (sequenceCounter > maxSequence){
                maxSequence = sequenceCounter;
            }
        }

    }
}

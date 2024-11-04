import java.util.Scanner;

public class TSUM {
    public static int tCounter = 0;
    public static int tripleSum(int n) {
        int tCounter = 0;
        for (int nMaior = n - 2; nMaior >= 1; nMaior--) {
            for (int nMedio = nMaior; nMedio >= 1; nMedio--) {
                for (int nMenor = nMedio; nMenor >= 1; nMenor--) {
                    if (nMaior + nMedio + nMenor == n) {
                        System.out.println(nMaior + " + " + nMedio + " + " + nMenor);
                        tCounter++;
                    }
                }
            }
        }
        return tCounter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tCounter = tripleSum(n);
        System.out.println("triples=" + tCounter);
    }
}



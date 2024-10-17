import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nInput = reader.nextInt();
        double max = 0.00;
        if (nInput > 0){
            for (int i = 0; i <= nInput - 1; i++){
                int number = reader.nextInt();
                int numberInter = number;
                int numberRest = number;
                int divCounter = 0;
                int numberCounter = 0;
                double media = 0.00;
                do {
                    numberRest = numberInter % 10;
                    numberInter = numberInter / 10;
                    if (numberRest != 0){
                        if (number % numberRest == 0){
                            divCounter++;
                        }
                    }
                    numberCounter++;
                }while (numberInter > 0);

                media = ((double) divCounter / (double) numberCounter) * 100;
                System.out.println(String.format("%.2f%%", media));
                if (media > max) {
                    max = media;
                }
            }
            System.out.println(String.format("(%.2f%%)", max));
        }
    }
}
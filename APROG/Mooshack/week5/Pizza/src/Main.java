import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ingredients = scanner.nextInt();
        int numberPizzas = scanner.nextInt();
        int optionCounter = 0;
        for (int i = 0; i < numberPizzas; i++) {
            int pizzaOption = scanner.nextInt();
            int pizzaTemp = pizzaOption;
            boolean notOption = false;

            do {
                int ingredientFromPizza = pizzaTemp % 10;
                pizzaTemp = pizzaTemp / 10;
                int ingredientTemp = ingredients;

                do {
                    int ingredientForbiden = ingredientTemp % 10;
                    ingredientTemp = ingredientTemp / 10;
                    if (ingredientFromPizza == ingredientForbiden) {
                        notOption = true;
                        break;
                    }
                } while (ingredientTemp > 0);

                if (notOption) {
                    break;
                }
            } while (pizzaTemp > 0);

            if (!notOption) {
                optionCounter++;
                System.out.println("Suggestion #"+optionCounter+":"+pizzaOption);
            }
        }
    }
}
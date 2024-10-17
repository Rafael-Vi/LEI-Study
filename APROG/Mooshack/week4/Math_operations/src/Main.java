public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = sumOperation(numbers);
        System.out.println("Sum: " + sum);

        int multiply = multiplyOperation(numbers);
        System.out.println("Multiplication: " + multiply);

        float divide = divideOperation(numbers);
        System.out.println("Division: " + divide);
    }

    public static int sumOperation(int[] numbersToSum) {
        int sum = 0;
        for (int value : numbersToSum) {
            sum += value;
        }
        return sum;
    }

    public static int multiplyOperation(int[] numbersToMultiply) {
        int multiply = 1;
        for (int value : numbersToMultiply) {
            multiply *= value;
        }
        return multiply;
    }

    public static float divideOperation(int[] numbersToDivide) {
        if (numbersToDivide.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        float divide = numbersToDivide[0];

        // Start loop from index 1 to skip the first value
        for (int i = 1; i < numbersToDivide.length; i++) {
            divide /= numbersToDivide[i];
        }
        return divide;
    }

}
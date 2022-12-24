package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            System.out.println(factorial(number));
            ++number;
        }
    }

    private int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        int result = 1;
        int counter = 1;
        while (counter <= number) {
            result *= counter;
            ++counter;
        }
        return result;
    }
}
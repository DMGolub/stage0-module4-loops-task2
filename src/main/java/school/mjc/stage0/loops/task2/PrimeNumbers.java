package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            if (isSimpleNumber(number)) {
                System.out.println(number);
            }
            ++number;
        }
    }

    private boolean isSimpleNumber(int number) {
        if (number < 2) {
            return false;
        }
        boolean isSimple = true;
        int divider = 2;
        while (divider < number) {
            if (number % divider == 0) {
                isSimple = false;
                break;
            }
            ++divider;
        }
        return isSimple;
    }
}
package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int counter = 0;
            while (counter <= power) {
                System.out.println(getPowerOfTwo(counter));
                ++counter;
            }
        }
    }

    private int getPowerOfTwo(int power) {
        if (power == 0) {
            return 1;
        }
        int result = 1;
        int currPower = 1;
        while (currPower <= power) {
            result *= 2;
            ++currPower;
        }
        return result;
    }
}
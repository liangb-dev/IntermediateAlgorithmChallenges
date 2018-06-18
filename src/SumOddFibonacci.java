/*Given a positive integer 'max', return the sum of all odd Fibonacci numbers that are less than or equal to 'max'*/
/*The first two numbers in the Fibonacci sequence are 1 and 1. Every additional number in the sequence is the sum
* of the previous numbers. */
import java.util.ArrayList;

public class SumOddFibonacci extends IntermediateAlgorithm {
    // fields
    private final int max;
    // constructor
    SumOddFibonacci(int max) {
        this.max = max;
    }
    // methods
    protected Integer method1() {
        // Get fibonacci
        ArrayList<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);

        int max = 0;
        int sum = 0;

        while (fibs.get(max) <= this.max) {
            if (fibs.get(max)%2 != 0) {
                sum += fibs.get(max);
            }
            fibs.add(fibs.get(fibs.size()-2) + fibs.get(fibs.size()-1));
            max++;
        }

        System.out.println("The sum of odd fibonaccis up til " + this.max + " is: " + sum);

        return sum;
    }

}

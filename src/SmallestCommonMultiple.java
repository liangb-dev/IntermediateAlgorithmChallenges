/*Find the smallest common multiple of the provided parameters that can be evenly
divided by both, as well as by all sequential numbers in the range between these parameters.*/
public class SmallestCommonMultiple extends IntermediateAlgorithm {
    // fields
    private final int[] input;
    // constructor
    SmallestCommonMultiple(int[] input) {
        this.input = input;
    }
    // methods
    protected Integer method1() {
        int small = Math.min(input[0],input[1]);
        int large = Math.max(input[0],input[1]);

        int result = large * (large-1);
        boolean flag = true;
        int n = 1;


        // Before the answer is found keep looping
        while (flag) {
            // see if all numbers are divisible
            for (int i = large-2; i >= small; i--) {
                if (result*n % i != 0) {
                    break;
                }
                // answer is found
                else if (i <= small) {
                    flag = false;
                    result *= n;
                }
            }
            n++; // increment quotient

        }



        System.out.println("The smallest multiple is: " + result);
        return result;
    }
    }

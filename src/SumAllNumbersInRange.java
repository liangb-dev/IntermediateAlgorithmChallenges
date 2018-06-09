public class SumAllNumbersInRange extends IntermediateAlgorithm<Integer> {
    // Fields
    int[] input;


    // Constructor
    SumAllNumbersInRange(int[] input) {
        this.input = input;
    }


    // Methods
    protected Integer method1() {
        int sum = 0;
        int begin;
        int end;

        if (input[0] > input[1]) {
            begin = input[1];
            end = input[0];
        }
        else {
            end = input[1];
            begin = input[0];
        }

        while (begin <= end) {
            sum += begin;
            begin++;
        }

        System.out.println(sum);

        return sum;
    }
}

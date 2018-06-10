public class SequenceBreaker extends IntermediateAlgorithm {
    // fields
    private String sequence = "0";
    private int input;
    private int r = 0; // global for method2 using recursion

    // constructor
    SequenceBreaker(int num) {
        this.input = num;
        // generate sequence
        generateSequence();
    }


    // methods
    /**
     * Choice method makes user interface universal
     * no matter how many methods a class has.
     * @param choice
     */
    public void method(int choice) {
        switch(choice) {
            case 1:
                method1();
                break;
            case 2:
                method2();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    /**
     * Improvement on method1().
     * I realized that it was a very recursive process, and decided
     * to try to implement it using recursion. I also reduced a number
     * of lines by using modulo(3) to conform to the number changing
     * pattern.
     * @return
     */
    protected Integer method2() {
        // Determine which group inquired index belongs to -
        // groups based on powers of 2.
        int group = 0;
        while (input >= Math.pow(2,group)) {
            group++;
        }

        // copy input
        int num = input;
        // copy group
        int power = group-1;

        // Recursion until reach index 0
        recursive(num,power);

        r = r%3; //conform to 0-1-2-0

        System.out.println("Index inquired: " + input);
        System.out.println("Correct value: " + sequence.charAt(input));
        System.out.println("Counted value: " + r);
        return r;
    }

    /**
     * Until you reach predecessor index 0, keep subtracting the
     * smallest 2^(power) while keeping track of the number of
     * times you do this (global variable '2').
     * @param num
     * @param power
     * @return
     */
    private Integer recursive(int num, int power) {
        // Base case
        if (num == 0) {
            return num;
        }
        else if (num - Math.pow(2,power) < 0) { // not smallest 2^(power)
            return recursive(num,power-1); // reduce power, try again
        }
        else {
            r++; //increment counter
            return recursive(num -= Math.pow(2,power),power); // fold again until base case
        }

    }

    /**
     * The idea is that the sequence is in a way 'symmetric'. The
     * sequence copies itself (while changing the values), consequently
     * any value in the latter half can be paired with its former half self
     * - achieved by shifting the latter half by an amount equal to FULLSIZE/2
     * - for reference I shall call them a predecessor-descendant pair. The
     * predecessor value is the descendant value pre-increment. And since the
     * sequence simply doubles itself in length, the predecessor index can be
     * found by subtracting the descendant index by sequence.size()/2. And
     * this operation can be performed over and over again we trace it all the
     * way back to the initial value zero. The number of times we have
     * 'reverse-engineered' the sequence this way, is exactly the inquired
     * value - provided appropriate adjustments to 0-1-2-0 pattern (or in
     * other words modulo(3) I later realized).
     *
     * To find the 'predecessor', we have to subtract by FULLSIZE/2. I say
     * FULLSIZE because you won't find the 'predecessor' by subtracting
     * inquired_index/2 - you must figure out how many positions the
     * 'predecessor' had shifted. Since the sequence grows by powers of 2,
     * each index must fall within a growth range equal to the powers of 2.
     * I called these growth ranges 'groups'. It's determined by finding the
     * smallest 2^(k) after inquired index. That divided by 2 and subtracted
     * from the inquired index is how you find the predecessor index. Continue
     * this until you reach predecessor index 0.
     * It's important to emphasize smallest 2^(k) in order to be able to get to
     * the predecessor index 0.
     *
     *
     *
     *
     * @return
     */
    protected Integer method1() {

        // Determine which group inquired index belongs to -
        // groups based on powers of 2.
        int group = 0;
        while (input >= Math.pow(2,group)) {
            group++;
        }

        // copy input
        int num = input;
        // copy group
        int power = group-1;
        int count = 0; // keep count
        while (num > 0) {
            while (num - Math.pow(2,power) < 0) { //smallest 2^(power)
                power--;
            }
            num -= Math.pow(2,power);
            count++;
            power--;
            if (count == 3) { //replaced by modulo 3 in method2()
                count = 0;
            }
        }


        System.out.println("Index inquired: " + input);
        System.out.println("Correct value: " + sequence.charAt(input));
        System.out.println("Counted value: " + count);

        return count;
    }

    /**
     * I was able to generate the sequence up to a limit, which
     * I believe is the limit to how many characters String-type
     * is able to hold (2^31 - 1). Or the int-type, since I couldn't
     * replace the 'int' (String.substring() requires 'int' input)
     * where I used a for-loop to replace '3' with '0'.
     *
     * This method is able to generate the sequence up til:
     * '01121220122020011220200120010112'
     *
     * While I may not be able to answer the original answer, I will
     * attempt to solve the exercise using this shortened sequence
     * as tester.
     */
    private void generateSequence(){

        // 3000000000L
        while (sequence.length() < 32) {
            // add 1 to each number in sequence
            long add = Long.parseLong(sequence);
            for (long i = 0; i < sequence.length(); i++) {
                add += Math.pow(10,i);
            }

            // append result to original sequence
            sequence += Long.toString(add);

            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == '3') {
                    sequence = sequence.substring(0, i) + '0' + sequence.substring(i + 1, sequence.length());
                }
            }

        }
        System.out.println("Sequence: " + sequence);
    }


}

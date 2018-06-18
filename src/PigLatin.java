public class PigLatin extends IntermediateAlgorithm {
    // fields
    String input;
    // constructors
    PigLatin(String input) {
        this.input = input;
    }

    // methods
    protected Integer method1() {
        String result;
        result = input.substring(1,input.length()) + input.charAt(0) + "ay";

        System.out.println(result);

        return 1;
    }
}

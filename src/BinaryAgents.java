public class BinaryAgents extends IntermediateAlgorithm {
    // fields
    private final String input;
    // constructor
    BinaryAgents(String input) {
        this.input = input;
    }
    // methods
    protected String method1() {

        String result  = " ";
        // Get Array of Binary
        String[] arr = input.split(" ");

        // Translate Binary to Number
        // Get Char from Binary
        for (String bin : arr) {
            result += (char)fromBinary(bin);
        }

        System.out.println(result);

        return result;
    }

    private int fromBinary(String bin) {
        int result = 0;
        for (int i = bin.length()-1; i > 0; i--) {
            int position = Integer.parseInt(String.valueOf(bin.charAt(i)));
            result += position*Math.pow(2,(bin.length()-1-i));
        }

        return result;
    }
}

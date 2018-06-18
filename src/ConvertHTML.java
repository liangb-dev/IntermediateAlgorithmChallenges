/*Convert the characters &, <, >, " (double quote), and ' (apostrophe),
 in a string to their corresponding HTML entities.*/
public class ConvertHTML extends IntermediateAlgorithm {
    // fields
    private final String input;
    // constructor
    ConvertHTML(String input) {
        this.input = input;
    }
    // methods
    protected String method1() {

        String[] input_arr = input.split("");

        for (int i = 0; i < input_arr.length; i++) {
            switch (input_arr[i]) {
                case "&":
                    input_arr[i] = "&amp;";
                    break;
                case "<":
                    input_arr[i] = "&lt;";
                    break;
                case ">":
                    input_arr[i] = "&gt";
                    break;
                case "\"":
                    input_arr[i] = "&quot;";
                    break;
                case "'":
                    input_arr[i] = "&apos;";
                    break;
                default:
                    break;
            }
        }

        String result = String.join("", input_arr);

        System.out.println(result);

        return result;
    }
}

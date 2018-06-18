/*Find the missing letter in the given alphabet String sequence*/
public class MissingLetters extends IntermediateAlgorithm {
    // fields
    private final String input;
    // constructors
    MissingLetters(String input) {
        this.input = input;
    }
    // methods
    protected Character method1() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet_array = alphabet.split("");
        String[] input_array = input.split("");

        int k = 0;

        for (int i = 0; i < alphabet_array.length; i++) {
            if (input_array[k].equals(alphabet_array[i])) {
                k++;
            }
            else {
                if (k != 0) {
                    System.out.println(alphabet.charAt(i));
                    return alphabet.charAt(i);
                }
            }
        }

        System.out.println("Sequence complete, no missing letter. ");
        return null;
    }
}

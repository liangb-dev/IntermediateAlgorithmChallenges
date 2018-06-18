/* Given a sentence, a word (String) to seek for in the sentence, and another String to replace the sought word */
public class SearchAndReplace extends IntermediateAlgorithm {
    // fields
    String sentence;
    String search;
    String replace;
    // constructors
    SearchAndReplace(String sentence, String search, String replace) {
        this.sentence = sentence;
        this.search = search;
        this.replace = replace;
    }
    // methods
    protected Integer method1() {

        String[] arr = sentence.split(" ");


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                arr[i] = replace;
            }
        }

        String result = String.join(" ", arr);

        System.out.println(result);

        return 1;
    }
}

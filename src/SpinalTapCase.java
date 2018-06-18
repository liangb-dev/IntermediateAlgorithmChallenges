public class SpinalTapCase extends IntermediateAlgorithm {
    // fields
    String input;
    // constructors
    SpinalTapCase(String input) {
        this.input = input;
    }
    // methods
    protected Integer method1(){

        // to lowercase
        input = input.toLowerCase();
        // split by " " into array, then join by "-"
        input = String.join("-",input.split(" "));

        System.out.println(input);

        return 1;
    }
}

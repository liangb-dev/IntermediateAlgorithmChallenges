/* Given a dictionary and a value (not key), find return the value if found in the dictionary */
import java.util.HashMap;
import java.util.Map;

public class WhereArtThou extends IntermediateAlgorithm<Integer> {
    // fields
    Map<String,String> input1 = new HashMap<>();
    String input2;

    // constructors
    WhereArtThou(Map<String,String> input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    // methods
    protected Integer method1() {
        String result;
        // Iterate through elements in dictionary
        for (Map.Entry<String,String> value : input1.entrySet()) {
            if (value.getValue() == input2) {
                result = value.getKey();
                System.out.println(result);
            }
        }

        return 1;
    }



}

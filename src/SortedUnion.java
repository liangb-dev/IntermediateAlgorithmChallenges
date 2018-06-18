/*Takes two or more arrays and retuns a new array of unique values in the order of the provided arrays*/
import java.util.ArrayList;
public class SortedUnion extends IntermediateAlgorithm {
    // fields
    int[][] input;
    // constructor
    SortedUnion(int[]... inputs) {
        this.input = inputs;
    }
    // methods
    protected String method1() {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int[] array : input) {
            for (int n : array) {
                if (!unique.contains(n)) {
                    unique.add(n);
                }
            }
        }

        Integer[] result = new Integer[unique.size()];
        result = unique.toArray(result);

        for (int item : result) {
            System.out.println(item);
        }

        return "";
    }
}

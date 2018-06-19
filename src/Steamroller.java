import java.util.List;

public class Steamroller extends IntermediateAlgorithm {
    // fields
    private final String input;
    private String result = "";

    // constructor
    Steamroller(String input) {
        this.input = input;
    }

    // methods
    protected String method1() {

        Object[] set = new Object[]{1, new Object[]{2,3}, 4, new Object[]{5, new Object[]{6,7,8}}};

        recursion(set);

        System.out.println(result);

        return input;
    }

    /**
     * Recursively checks if an element is an array, in which
     * case it enters recursion, otherwise the element is appended
     * to a String 'result'.
     * @param arr
     * @return
     */
    private int recursion(Object[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Object[]) {
                recursion((Object[])arr[i]);
            }
            else {
                result += ""+arr[i];
            }
        }

        return 1;
    }
}

import java.util.*;

public class DiffTwoArrays extends IntermediateAlgorithm {
    // fields
    private int[] input1;
    private int[] input2;
    private String input;

    // constructor
    DiffTwoArrays(int[] input1, int[] input2) {
        this.input1 = input1;
        this.input2 = input2;
    }
    DiffTwoArrays(String input) {
        this.input = input;
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
     * I realized this intermediate algorithm was similar to one interview
     * question that I recently had failed to answer in time so I have
     * decided to adapt it to my interview question.
     * The goal is to return the first non-duplicate letter in a String. In
     * other words, I need only eliminate all duplicate letters in given String.
     * I've done so in similar structure to the integer array in method1:
     * 1. Take a Character, say 'A', and compare to every other Character in String
     *    through two loop iterations.
     * 2. Once duplicate Characters are found eliminate the latter, since we need
     *    the first 'A' to figure out if there are even more duplicates. At the
     *    same time use a Boolean flag to denote that a duplicate was found.
     * 3. Once we've finish comparing 'A' to every other Character, eliminate that
     *    first Character, in this case 'A', if duplicates were found. Else leave it.
     *    It's important to decrement the iterator after each time you eliminate a
     *    Character since its elimination will disrupt the initial position of the
     *    Characters and iterators. ie. 'O' at index 9 might become index 8 afterwards.
     * 4. By the end when all Characters have been iterated through, we will have
     *    a String in which all originally duplicate letters have been erased. The
     *    first letter in this String was the original first non-duplicate letter.
     * @return
     */
    protected String method2() {
        // copy String
        String result = input;

        boolean found;

        for (int i = 0; i < result.length()-1; i++) {
            found = false;
            for (int j = i+1; j < result.length(); j++) {
                if (result.charAt(i)== result.charAt(j)) {
                    found = true;
                    result = result.substring(0,j) + result.substring(j+1,result.length());
                    j--;
                }
            }
            if (found == true) {
                result = result.substring(0,i) + result.substring(i+1,result.length());
                i--;
            }
        }

        System.out.println(result);
        return result;
    }


    /**
     * See description for method2(), which has been written in the exact
     * same fashion except for Strings instead of int[]
     * @return
     */
    protected int[] method1() {

        // ArraList
        ArrayList<Integer> mergeArray = new ArrayList<>();

        // merge arrays
        for (int item : input1) {
            mergeArray.add(item);
        }
        for (int item : input2) {
            mergeArray.add(item);
        }

        System.out.println(mergeArray);

        boolean found;

        for (int j = 0; j < mergeArray.size()-1; j++) {
            found = false;
            for (int i = j + 1; i < mergeArray.size(); i++) {
                if (mergeArray.get(j) == mergeArray.get(i)) {
                    found = true;
                    mergeArray.remove(i); // important to remove latter duplicate
                    i--;
                }
            }
            if (found == true) {
                mergeArray.remove(j);
                j--; // important because when u remove 'current'
            }

        }

        int[] result = new int[mergeArray.size()];
        int i = 0;
        for (int item: mergeArray) {
            result[i] = item;
            i++;
        }

        printArray(result);

        return result;

    }

    /**
     * Prints an Array inline
     * @param arr
     */
    private void printArray(int[] arr) {
        String line = "";
        for (int obj : arr) {
            line += Integer.toString(obj) + " ";
        }
        System.out.println("'" + line.substring(0,line.length()-1) + "'");
    }

    /**
     * Remove element from array
     */
    private int[] removeElement(int[] arr, int i) {
        int[] result = new int[arr.length-1];
        int k = 0; // iterator
        for (int j = 0; j < arr.length; j++) {
            if (j != i) {
                result[k] = arr[j];
                k++;
            }
        }
        return result;
    }

}

public class Main {
    public static void main(String[] args) {

        // Testing algorithm DiffTwoArrays
        IntermediateAlgorithm object4 = new DiffTwoArrays("tooth");
        object4.method(2);
        IntermediateAlgorithm object5 = new DiffTwoArrays("yellow");
        object5.method(2);

        System.out.println("");

        // Testing algorithm SequenceBreaker
        IntermediateAlgorithm object1 = new SequenceBreaker(11);
        object1.method(2);
        IntermediateAlgorithm object2 = new SequenceBreaker(9);
        object2.method(2);
        IntermediateAlgorithm object3 = new SequenceBreaker(29);
        object3.method(2);
    }
}

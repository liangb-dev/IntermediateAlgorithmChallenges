public abstract class IntermediateAlgorithm<T> {
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
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    protected abstract T method1();
}

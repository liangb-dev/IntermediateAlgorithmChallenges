public class DNAPairing extends IntermediateAlgorithm {
    // fields
    String input;
    // constructors
    DNAPairing(String input) {
        this.input = input;
    }
    // methods
    protected Integer method1() {

        String[][] result = new String[input.length()][2];
        String[] container;


        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                    result[i][0] = "A";
                    result[i][1] = "T";
                    break;
                case 'T':
                    result[i][0] = "T";
                    result[i][1] = "A";
                    break;
                case 'C':
                    result[i][0] = "C";
                    result[i][1] = "G";
                    break;
                case 'G':
                    result[i][0] = "G";
                    result[i][1] = "C";
                    break;
                default:
                    System.out.println("Error in input. ");
                    return 1;
            }
        }

        String result2 = "[";

        for (int i = 0; i < result.length; i++) {
            result2 += "[";
            for (int j = 0; j < result[i].length; j++) {
                result2 += result[i][j];
                if (j != result[i].length-1) {
                    result2 += ",";
                }
            }
            result2 += "]";
            if (i != result.length-1) {
                result2 += ",";
            }
        }
        result2 += "]";


        System.out.println(result2);

        return 1;
    }
}

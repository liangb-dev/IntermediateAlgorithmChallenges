/*Sum all the prime numbers up to and including the provided number*/
/*A prime number is defined as a number greater than one and having onlt two divisors*/
public class SumAllPrimes extends IntermediateAlgorithm {
    // fields
    private final int max;
    // constructor
    SumAllPrimes(int max) {
        this.max = max;
    }
    // methods
    protected Integer method1() {

        int result = 0;
        int prime = 2;
        boolean isPrime;

        // compare up til provided number
        while (prime <= max) {
            // check if prime, in which case add
            if (isPrime(prime)) {
                System.out.println(prime);
                result += prime;
            }

            prime++;
        }

        System.out.println("The sum of primes up til " + max + " is: " + result);
        return result;
    }


    /**
     * Checks if a number is prime.
     * Only checks up til root of number,
     * and also skips all even numbers.
     * @param n
     * @return
     */
    private boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n%2 == 0) {
            return false;
        }
        // only need to check odds up til square root
        for (int i = 3; i*i<=n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

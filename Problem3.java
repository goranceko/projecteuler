package problems;

/**
 * Problem 3 - Largest prime factor
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 * <p>
 * Prime number is a number that is greater than 1 and divided by 1 or itself only.
 */
public class Problem3 {

    private static final long NUMBER = 600851475143L;

    public static void main(String[] args) {
        long current = 5;
        long largest = current;
        while (current++ < NUMBER) {
            if (isPrime(current)) {
                largest = current;
                System.out.println(largest);
            }
        }

        System.out.println("Largest prime factor of the number 600851475143 is " + largest);
    }

    //checks whether an int is prime or not.
    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }

}

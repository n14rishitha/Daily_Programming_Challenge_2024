import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    public static List<Long> primeFactors(long N) {
        List<Long> factors = new ArrayList<>();

        while (N % 2 == 0) {
            factors.add(2L);
            N /= 2;
        }
        for (long i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }
        if (N > 2) {
            factors.add(N);
        }

        return factors;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        long N = scanner.nextLong();
        List<Long> primeFactors = primeFactors(N);
        System.out.println("Prime factors of " + N + " are: " + primeFactors);
        scanner.close();
    }
}

import java.util.Scanner;

public class DivisorCount {
    public static int countDivisors(long N) {
        int count = 0;
        
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                count++; 
                if (i != N / i) {
                    count++; 
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        long N = scanner.nextLong();
        int divisorCount = countDivisors(N);
        System.out.println("Number of divisors of " + N + " is: " + divisorCount);
        scanner.close();
    }
}

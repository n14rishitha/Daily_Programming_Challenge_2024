import java.util.Scanner;

public class LCMCalculator {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long n, long m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (N and M): ");
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long result = lcm(N, M);
        System.out.println("LCM of " + N + " and " + M + " is: " + result);
        scanner.close();
    }
}

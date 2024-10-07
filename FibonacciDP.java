import java.util.Scanner;

public class FibonacciDP {

    // Function to calculate the nth Fibonacci number using dynamic programming
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Create an array to store Fibonacci numbers
        long[] dp = new long[n + 1];
        dp[0] = 0; // Base case: F(0) = 0
        dp[1] = 1; // Base case: F(1) = 1

        // Fill the dp array using bottom-up approach
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Calculate the nth Fibonacci number
        long result = fibonacci(n);

        System.out.println("The " + n + "-th Fibonacci number is: " + result);
    }
}

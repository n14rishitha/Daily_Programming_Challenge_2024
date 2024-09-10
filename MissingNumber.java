public class MissingNumber {
    public static long findMissingNumber(int[] arr, int n) {
        // Calculate the sum of the first n natural numbers using the formula: n * (n + 1) / 2
        long totalSum = (long) n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        long arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Example test case 1
        int[] arr1 = {1, 2, 4, 5};
        int n1 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr1, n1)); // Output: 3

        // Example test case 2
        int[] arr2 = {2, 3, 4, 5};
        int n2 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr2, n2)); // Output: 1

        // Example test case 3
        int[] arr3 = {1, 2, 3, 4};
        int n3 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr3, n3)); // Output: 5

        // Example test case 4
        int[] arr4 = {1};
        int n4 = 2;
        System.out.println("Missing number: " + findMissingNumber(arr4, n4)); // Output: 2

        // Example test case 5
        int[] arr5 = new int[999999];
        for (int i = 1; i < 1000000; i++) {
            arr5[i - 1] = i;
        }
        System.out.println("Missing number: " + findMissingNumber(arr5, 1000000)); // Output: 1000000
    }
}

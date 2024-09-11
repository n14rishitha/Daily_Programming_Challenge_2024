public class FindDuplicateNumber {
    public static int findDuplicateNumber(int[] arr) {
        int tortoise = arr[0];
        int hare = arr[0];
        
        do {
            tortoise = arr[tortoise]; // moves by 1 step
            hare = arr[arr[hare]];    // moves by 2 steps
        } while (tortoise != hare);
        
        tortoise = arr[0];
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        
        return hare;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr1)); // Output: 2

        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr2)); // Output: 3

        int[] arr3 = {1, 1};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr3)); // Output: 1

        int[] arr4 = {1, 4, 4, 2, 3};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr4)); // Output: 4

        int[] arr5 = new int[100000];
        for (int i = 0; i < 99999; i++) {
            arr5[i] = i + 1;
        }
        arr5[99999] = 50000;
        System.out.println("Duplicate number: " + findDuplicateNumber(arr5)); // Output: 50000
    }
}


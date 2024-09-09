import java.util.*;

public class DutchFlagSorting012 {

    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array (0, 1, 2) separated by spaces:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("[]");
            return;
        }

        String[] inputArray = input.trim().split(",");
        int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}

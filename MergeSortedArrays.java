import java.util.Arrays;

public class MergeSortedArrays {

    public static void mergeArrays(int[] arr1, int m, int[] arr2, int n) {
        for (int i = 0; i < m; i++) {
            
            if (arr1[i] > arr2[0]) {
                
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];
                int k;
                for (k = 1; k < n && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1_1 = {1, 3, 5};
        int[] arr2_1 = {2, 4, 6};
        mergeArrays(arr1_1, arr1_1.length, arr2_1, arr2_1.length);
        System.out.println("arr1: " + Arrays.toString(arr1_1));
        System.out.println("arr2: " + Arrays.toString(arr2_1));

        // Test case 2
        int[] arr1_2 = {10, 12, 14};
        int[] arr2_2 = {1, 3, 5};
        mergeArrays(arr1_2, arr1_2.length, arr2_2, arr2_2.length);
        System.out.println("arr1: " + Arrays.toString(arr1_2));
        System.out.println("arr2: " + Arrays.toString(arr2_2));

        // Test case 3
        int[] arr1_3 = {2, 3, 8};
        int[] arr2_3 = {4, 6, 10};
        mergeArrays(arr1_3, arr1_3.length, arr2_3, arr2_3.length);
        System.out.println("arr1: " + Arrays.toString(arr1_3));
        System.out.println("arr2: " + Arrays.toString(arr2_3));

        // Test case 4
        int[] arr1_4 = {1};
        int[] arr2_4 = {2};
        mergeArrays(arr1_4, arr1_4.length, arr2_4, arr2_4.length);
        System.out.println("arr1: " + Arrays.toString(arr1_4));
        System.out.println("arr2: " + Arrays.toString(arr2_4));

        // Test case 5 (Large Input)
        int[] arr1_5 = new int[50000];
        int[] arr2_5 = new int[50000];
        for (int i = 0; i < 50000; i++) {
            arr1_5[i] = i + 1;
            arr2_5[i] = i + 50001;
        }
        mergeArrays(arr1_5, arr1_5.length, arr2_5, arr2_5.length);
        System.out.println("Test case 5 passed successfully.");
    }
}

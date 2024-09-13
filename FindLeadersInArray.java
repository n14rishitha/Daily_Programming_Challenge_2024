import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindLeadersInArray {

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        
        int maxRight = arr[n - 1];
        leaders.add(maxRight);  

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i]; 
            }
        }

        Collections.reverse(leaders);
        
        return leaders;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);
        
        sc.close();
    }
}

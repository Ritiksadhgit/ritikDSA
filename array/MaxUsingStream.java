package array;
import java.util.*;
import java.util.stream.*;

public class MaxUsingStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Maximum number = " + max);
    }
}

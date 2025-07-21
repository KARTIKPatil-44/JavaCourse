import java.util.*;

public class Min_Max {
    public static int minmax(int arr[]) {
        int largest = Integer.MIN_VALUE; // - INFINITY which has a min values
        int smallest = Integer.MAX_VALUE; // + INFINITY which has max values
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

        }
        System.out.println("Smallest element is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 5 };
        System.out.println("Largest element is : " + minmax(arr));

    }

}

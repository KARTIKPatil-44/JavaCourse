package Sorting;

class Bubble_Sorting {
    public static void bubbleSorting(int arr[]) {
        boolean isSorted = true;

        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    isSorted = false;
                }
            }
            // If no swapping happened in this pass, break early
            if (!swapped)
                break;
        }

        if (isSorted) {
            System.out.println("This array is already sorted");
        } else {
            printArr(arr);
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }; // Already sorted
        int arr2[] = { 5, 4, 1, 3, 2 }; // Not sorted

        System.out.println("Testing arr1:");
        bubbleSorting(arr1);

        System.out.println("Testing arr2:");
        bubbleSorting(arr2);
    }
}

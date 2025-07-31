package Arrays_Part2;

import java.util.Arrays;
import java.util.HashMap;

public class Contains_Duplicate {

    // Function to check if array contains any duplicate values
    public static boolean containsDupllicate(int arr[]) {

        int n = arr.length;

        // ----------- APPROACH 1: Brute Force -----------
        // Time Complexity: O(n^2)
        // Check every pair for duplicates
        /*
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
        */

        // ----------- APPROACH 2: Sorting -----------
        // Time Complexity: O(n log n)
        // Sort the array and check adjacent elements
        /*
        Arrays.sort(arr); // In-place sorting
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
        */

        // ----------- APPROACH 3: HashMap -----------
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // Store elements and their counts in a map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Increment count or initialize to 1
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // If count becomes >1, duplicate exists
            if (map.get(arr[i]) > 1) {
                return true;
            }
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};

        // Output: true (since 1 is repeated)
        System.out.println(containsDupllicate(arr));
    }
}
